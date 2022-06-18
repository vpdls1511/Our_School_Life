package com.life.school.our.server.application.post.service;

import com.life.school.our.server.application.post.repository.GetPostsDataRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
class PostServiceTest {

    @Autowired
    private GetPostsDataRepository getPostsDataRepository;

    @Test
    void 최근_불만사항_가져오기(){
        assertThat(getPostsDataRepository.getRecentlySuggest(0).size())
                .isEqualTo(20);
    }
}