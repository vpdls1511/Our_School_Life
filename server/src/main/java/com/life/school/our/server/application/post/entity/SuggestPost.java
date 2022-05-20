package com.life.school.our.server.application.post.entity;

import com.life.school.our.server.common.BaseTimeEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "suggest")
public class SuggestPost extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long POST_ID;

    @Column(nullable = false)
    private String SUGGEST_DESC;
    @Column(nullable = false)
    private long SUGGEST_LIKE;
    @Column(nullable = false)
    private boolean SUGGEST_TYPE;
}
