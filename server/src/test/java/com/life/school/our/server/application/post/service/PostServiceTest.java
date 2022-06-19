package com.life.school.our.server.application.post.service;

import com.blazebit.persistence.Criteria;
import com.blazebit.persistence.CriteriaBuilderFactory;
import com.blazebit.persistence.querydsl.BlazeJPAQuery;
import com.life.school.our.server.application.post.entity.Posts;
import com.life.school.our.server.application.post.repository.GetPostsDataRepository;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.persistence.EntityManager;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("dev")
class PostServiceTest {

    @Autowired
    private GetPostsDataRepository getPostsDataRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    private CriteriaBuilderFactory cbf;

    @Test
    void 최근_불만사항_가져오기() {
        assertThat(getPostsDataRepository.getRecentlySuggest(0).size())
                .isEqualTo(20);
    }

    @Test
    void Blaze_테스트() {
        BlazeJPAQuery query =  new BlazeJPAQuery<Tuple>(em, cbf);
    }

}