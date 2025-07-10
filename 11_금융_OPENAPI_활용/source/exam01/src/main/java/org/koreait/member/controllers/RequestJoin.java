package org.koreait.member.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestJoin {
    @Email(message = "이메일 형식 아님")
    @NotBlank(message = "이메일 쓰셈")
    private String email;

    @NotBlank(message = "비밀번호 쓰셈")
    private String password;

    @NotBlank(message = "회원명 쓰셈")
    private String name;
}
