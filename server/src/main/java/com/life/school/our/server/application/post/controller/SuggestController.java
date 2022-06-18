package com.life.school.our.server.application.post.controller;

import com.life.school.our.server.application.post.service.PostService;
import com.querydsl.core.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/suggest-posts")
public class SuggestController {

    @Autowired
    private PostService postService;

    @GetMapping("recently")
    public ResponseEntity<List> getRecentlyPost(){
        List<Tuple> tp = postService.getSuggestPost(1);
        return new ResponseEntity<List>( tp , HttpStatus.OK);
    }
}
