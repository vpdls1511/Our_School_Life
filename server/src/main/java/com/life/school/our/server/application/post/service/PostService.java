package com.life.school.our.server.application.post.service;

import com.life.school.our.server.application.post.repository.GetPostsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostService {

    @Autowired
    private GetPostsDataRepository getPostsDataRepository;

    public void getSuggestPost(final int lastIdx){
        getPostsDataRepository.getRecentlySuggest(lastIdx);
    }

}
