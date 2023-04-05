package com.group.libraryapp.dto.user.request;

import lombok.Getter;

@Getter
public class UserCreateRequest {
    private String name;    // Null 불가
    private Integer age;    // Integer는 Null표현 가능
}
