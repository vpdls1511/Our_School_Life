package com.life.school.our.server.application.post.repository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static com.life.school.our.server.application.post.entity.QPosts.posts;
import static com.life.school.our.server.application.members.entity.QUsers.users;


@Repository
@RequiredArgsConstructor
public class GetPostsDataImpl{

    private final JPAQueryFactory queryFactory;

    public List<Tuple> getRecentlySuggest() {
        return queryFactory
                .select(posts, users)
                .from(posts)
                .leftJoin(users)
                .on(posts.USER_ID.eq(users.USER_ID))
                .orderBy(posts.created_at.desc())
                .limit(20)
                .fetch();
    }
}
