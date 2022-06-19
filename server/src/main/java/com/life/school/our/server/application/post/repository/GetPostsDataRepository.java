package com.life.school.our.server.application.post.repository;

import com.life.school.our.server.application.post.entity.QPostsSolveSubSelect;
import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static com.life.school.our.server.application.members.entity.QMembers.members;
import static com.life.school.our.server.application.post.entity.QPostsSolveSubSelect.postsSolveSubSelect;
import static com.life.school.our.server.application.post.entity.QPostsSubSelect.postsSubSelect;


@Repository
@RequiredArgsConstructor
public class GetPostsDataRepository {

    private final JPAQueryFactory queryFactory;

    public List<Tuple> getRecentlySuggest() {
        return queryFactory
                .select(postsSubSelect, members)
                .from(postsSubSelect)
                .join(members).on(postsSubSelect.userId.eq(members.userId))
                .fetch();
    }

    public List<Tuple> getRecentlySolvedSuggest() {
        return queryFactory
                .select(postsSolveSubSelect, members)
                .from(postsSolveSubSelect)
                .join(members).on(postsSolveSubSelect.userId.eq(members.userId))
                .fetch();
    }

}
