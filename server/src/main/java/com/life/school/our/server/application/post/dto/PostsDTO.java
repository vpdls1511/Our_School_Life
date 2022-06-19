package com.life.school.our.server.application.post.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class PostsDTO {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UpdateRequest{
        private long post_id;
        private int post_type;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UpdateResponse{
        private String updatePostId;
        private String updateType;

        public UpdateResponse(final long updatePostId, final int updateType){
            this.updatePostId = String.valueOf(updatePostId);
            this.updateType = String.valueOf(updateType);
        }

        @Override
        public String toString(){
            return updatePostId + "가 " + updateType + "로 업데이트 되었습니다";
        }
    }
}
