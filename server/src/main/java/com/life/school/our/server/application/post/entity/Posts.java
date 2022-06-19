package com.life.school.our.server.application.post.entity;

import com.life.school.our.server.application.common.BaseTimeEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "posts")
public class Posts extends BaseTimeEntity {

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
