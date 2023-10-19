package com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.gateways;

import com.cleanarch.SPRINGBOOTCLEANARCH.domain.entity.User;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObject){
        return new UserEntity(userDomainObject.user_name(), userDomainObject.password(), userDomainObject.email());
    }
    User toDomainObject(UserEntity userEntity){
        return new User(userEntity.getUser_name(), userEntity.getPassword(), userEntity.getEmail());
    }
}
