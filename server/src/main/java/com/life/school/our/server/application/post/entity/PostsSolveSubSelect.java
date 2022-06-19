package com.life.school.our.server.application.post.entity;

import com.life.school.our.server.application.common.BaseTimeEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@Entity
@Subselect(
      " select *"
    + " from posts"
    + " WHERE post_type = 1 "
    + " order by created_at desc"
    + " limit 20"
)
@Getter
@Setter
@Table(name = "Posts")
public class PostsSolveSubSelect extends BaseTimeEntity {

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
