package com.life.school.our.server.application.members.service;

import com.life.school.our.server.application.common.exceptoins.NoMatchDataException;
import com.life.school.our.server.application.common.exceptoins.NoSearchDataException;
import com.life.school.our.server.application.members.dto.MemberDTO;
import com.life.school.our.server.application.members.entity.Members;
import com.life.school.our.server.application.members.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private static final String NO_SEARCH_EXCEPTION_MESSAGE = "계정을 찾을 수 없습니다";
    private static final String NO_MATCH_EXCEPTION_MESSAGE = "계정을 찾을 수 없습니다";

    @Autowired
    private MemberRepository memberRepository;

    public ResponseEntity loginMember(final MemberDTO.Request request){
        Optional<Members> members = Optional.ofNullable(memberRepository.findByUserNumber(request.getUserNumber())
                .orElseThrow(() -> new NoSearchDataException(NO_SEARCH_EXCEPTION_MESSAGE)));

        if(request.getUserPassword().equals(members.get().getUserPassword())){
            MemberDTO.Response response = MemberDTO.Response.builder()
                    .userId(members.get().getUserId())
                    .userNumber(members.get().getUserNumber())
                    .userNickname(members.get().getUserNickname())
                    .build();
            return new ResponseEntity(response, null, HttpStatus.OK);
        }

        return new ResponseEntity("fail", null, HttpStatus.BAD_REQUEST);
    }

}
