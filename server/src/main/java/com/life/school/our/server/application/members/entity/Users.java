package com.life.school.our.server.application.members.entity;

import com.life.school.our.server.application.common.BaseTimeEntity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users extends BaseTimeEntity {

    @Id
    private long USER_ID;
    @Column(nullable = false)
    private int USER_NUMBER;
    @Column(nullable = false)
    private String USER_PASSWORD;
    @Column(nullable = false)
    private String USER_NICKNAME;

}

