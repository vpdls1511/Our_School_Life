package com.life.school.our.server.application.post.repository;

import com.blazebit.persistence.CriteriaBuilderFactory;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static com.life.school.our.server.application.members.entity.QUsers.users;
import static com.life.school.our.server.application.post.entity.QPostsSubSelect.postsSubSelect;


@Repository
@RequiredArgsConstructor
public class GetPostsDataRepository {

    @Autowired
    private EntityManager em;

    private final JPAQueryFactory queryFactory;


    public List<Tuple> getRecentlySuggest(final int finalIdx) {
        return queryFactory
                .select(postsSubSelect, users)
                .from(postsSubSelect)
                .join(users).on(postsSubSelect.USER_ID.eq(users.USER_ID))
                .fetch();
    }

}
