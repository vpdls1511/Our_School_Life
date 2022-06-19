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
@Table(name = "Posts")
public class Posts extends BaseTimeEntity {

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
    @Column(nullable = false, columnDefinition = "TINYINT")
    private int POST_TYPE;


}
