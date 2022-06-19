package com.life.school.our.server.application.members.dto;

import lombok.*;

import javax.persistence.Column;

public class MemberDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Request {
        private int userNumber;
        private String userPassword;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private long userId;
        private int userNumber;
        private String userNickname;
    }

}
