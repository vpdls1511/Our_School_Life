package com.life.school.our.server.application.post.service;

import com.life.school.our.server.application.post.repository.GetPostsDataRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("dev")
class PostServiceTest {

    @Autowired
    private GetPostsDataRepository getPostsDataRepository;

    @Test
    void 최근_불만사항_가져오기() {
        assertThat(getPostsDataRepository.getRecentlySuggest().size())
                .isEqualTo(20);
    }

}