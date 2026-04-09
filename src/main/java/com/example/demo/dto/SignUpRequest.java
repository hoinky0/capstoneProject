package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SignUpRequest {
    private String email;
    private String password;
    private String nickname;
    private String dept;
    private String intro;
}
