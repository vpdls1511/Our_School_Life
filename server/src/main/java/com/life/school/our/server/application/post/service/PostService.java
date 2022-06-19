package com.life.school.our.server.application.post.service;

import com.life.school.our.server.application.members.entity.Members;
import com.life.school.our.server.application.post.dto.PostsDTO;
import com.life.school.our.server.application.post.entity.Posts;
import com.life.school.our.server.application.post.entity.PostsSubSelect;
import com.life.school.our.server.application.post.repository.GetPostsDataRepository;
import com.life.school.our.server.application.post.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PostService {

    @Autowired
    private GetPostsDataRepository getPostsDataRepository;
    @Autowired
    private PostsRepository postsRepository;

    public List getSuggestPost() {
        return getPostsDataRepository.getRecentlySuggest().stream()
                .map(item -> Stream.of(
                                item.get(0, PostsSubSelect.class),
                                item.get(1, Members.class))
                        .collect(Collectors.toList())
                )
                .collect(Collectors.toList());
    }

    public List getSolvedSuggestPost() {
        return getPostsDataRepository.getRecentlySolvedSuggest().stream()
                .map(item -> Stream.of(
                                item.get(0, PostsSubSelect.class),
                                item.get(1, Members.class))
                        .collect(Collectors.toList())
                )
                .collect(Collectors.toList());
    }

    public ResponseEntity createSuggest(final Posts posts){
        postsRepository.save(posts);
        return new ResponseEntity(posts, null, HttpStatus.OK);
    }

    public String updateSuggest(PostsDTO.UpdateRequest update) {
        Optional<Posts> post = postsRepository.findById(update.getPost_id());
        PostsDTO.UpdateResponse response = new PostsDTO.UpdateResponse(update.getPost_id(), update.getPost_type());

        post.get().setPOST_TYPE(update.getPost_type());
        postsRepository.save(post.get());

        return response.toString();
    }

}
