package com.life.school.our.server.application.post.controller;

import com.life.school.our.server.application.post.dto.PostsDTO;
import com.life.school.our.server.application.post.entity.Posts;
import com.life.school.our.server.application.post.service.PostService;
import com.querydsl.core.Tuple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/suggest-posts")
public class SuggestController {

    @Autowired
    private PostService postService;

    @GetMapping("recently")
    public ResponseEntity<List> getRecentlyPost(){
        List<Tuple> tp = postService.getSuggestPost();
        return new ResponseEntity<List>( tp , HttpStatus.OK);
    }

    @GetMapping("solve-suggest")
    public ResponseEntity<List> getSolveRecentlyPost(){
        List<Tuple> tp = postService.getSolvedSuggestPost();
        return new ResponseEntity<List>( tp , HttpStatus.OK);
    }

    @PutMapping("update-suggest")
    public ResponseEntity<String> updateSuggestState(@RequestBody PostsDTO.UpdateRequest update){
        String responseString = postService.updateSuggest(update);
        return new ResponseEntity<String>(responseString, HttpStatus.OK);
    }

}
