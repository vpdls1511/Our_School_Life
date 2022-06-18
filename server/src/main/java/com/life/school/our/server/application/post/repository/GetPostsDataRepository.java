package com.life.school.our.server.application.post.repository;

import com.life.school.our.server.application.post.entity.PostsSubSelect;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.life.school.our.server.application.members.entity.QUsers.users;
import static com.life.school.our.server.application.post.entity.QPostsSubSelect.postsSubSelect;


@Repository
@RequiredArgsConstructor
public class GetPostsDataRepository {

    private final JPAQueryFactory queryFactory;

    public List<Tuple> getRecentlySuggest(final int finalIdx) {
        return queryFactory
                .select(postsSubSelect, users)
                .from(postsSubSelect)
                .join(users).on(postsSubSelect.USER_ID.eq(users.USER_ID))
                .fetch();
    }
}
