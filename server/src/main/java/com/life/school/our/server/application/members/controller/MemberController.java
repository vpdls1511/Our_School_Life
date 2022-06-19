package com.life.school.our.server.application.members.controller;

import com.life.school.our.server.application.members.dto.MemberDTO;
import com.life.school.our.server.application.members.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("login")
    public ResponseEntity memberLogin(@RequestBody MemberDTO.Request request) {
        return memberService.loginMember(request);
    }
}
