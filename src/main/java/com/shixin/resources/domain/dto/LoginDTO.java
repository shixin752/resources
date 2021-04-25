package com.shixin.resources.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 登录验证
 * @Author shixin
 * @Date 2021/4/24 11:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginDTO {

    private String token;

    private UserInfo userInfo;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class UserInfo {
        private Long id;
        private String userId;
        private String userName;
        private String email;
        private String avatar;
        private Integer type;
    }

}
