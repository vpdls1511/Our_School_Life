package com.life.school.our.server.application.post.entity;

import com.life.school.our.server.application.common.BaseTimeEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@Entity
@Subselect(
      " select *"
    + " from posts"
    + " WHERE post_type = 0 "
    + " order by created_at desc"
    + " limit 20"
)
@Getter
@Setter
@Table(name = "posts")
public class PostsSubSelect extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long postId;
    @Column
    private long userId;

    @Column(nullable = false)
    private String postDesc;
    @Column(nullable = false)
    private long postComment;
    @Column(nullable = false)
    private long postLike;
    @Column(nullable = false, columnDefinition = "TINYINT")
    private int postType;

}
