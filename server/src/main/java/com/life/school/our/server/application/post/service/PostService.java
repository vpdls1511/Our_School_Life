package com.life.school.our.server.application.post.service;

import com.life.school.our.server.application.members.entity.Users;
import com.life.school.our.server.application.post.entity.PostsSubSelect;
import com.life.school.our.server.application.post.repository.GetPostsDataRepository;
import com.querydsl.core.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PostService {

    @Autowired
    private GetPostsDataRepository getPostsDataRepository;

    public List getSuggestPost(final int lastIdx){
        return getPostsDataRepository.getRecentlySuggest(lastIdx).stream()
                .map(item -> Stream.of(
                                item.get(0, PostsSubSelect.class),
                                item.get(1, Users.class))
                        .collect(Collectors.toList())
                )
                .collect(Collectors.toList());
    }

}
