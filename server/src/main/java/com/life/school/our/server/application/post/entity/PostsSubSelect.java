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
        "select *"
        + " from posts"
        + " order by created_at"
        + " limit 20"
)
@Getter
@Setter
@Table(name = "Posts")
public class PostsSubSelect extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long POST_ID;
    @Column
    private long USER_ID;

    @Column(nullable = false)
    private String POST_DESC;
    @Column(nullable = false)
    private long POST_COMMENT;
    @Column(nullable = false)
    private long POST_LIKE;
    @Column(nullable = false)
    private boolean POST_TYPE;


}
