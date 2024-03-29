package com.group.libraryapp.dto.user.response;

import com.group.libraryapp.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class UserResponse {

    private long id;
    private String name;
    private Integer age;

    public UserResponse(User user) {
        id = user.getId();
        name = user.getName();
        age = user.getAge();
    }
    public UserResponse(long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserResponse(long id, User user) {
        this.id = id;
        this.name = user.getName();
        this.age = user.getAge();
    }
}
