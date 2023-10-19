package com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.controllers;

import com.cleanarch.SPRINGBOOTCLEANARCH.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse(User user){
        return new CreateUserResponse(user.user_name(), user.email());
    }

    public User toUser(CreateUserRequest request){
        return new User(request.user_name(), request.password(), request.email());
    }
}
