package com.life.school.our.server.application.members.entity;

import com.life.school.our.server.application.common.BaseTimeEntity;
import com.life.school.our.server.application.members.dto.MemberDTO;
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
public class Members extends BaseTimeEntity {

    @Id
    private long userId;
    @Column(nullable = false)
    private int userNumber;
    @Column(nullable = false)
    private String userPassword;
    @Column(nullable = false)
    private String userNickname;

}

