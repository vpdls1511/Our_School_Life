package com.life.school.our.server.application.post.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/suggest-posts")
public class SuggestController {

    @GetMapping("recently")
    public void getRecentlyPost(){

    }
}
