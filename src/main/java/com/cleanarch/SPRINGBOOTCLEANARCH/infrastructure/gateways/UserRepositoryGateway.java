package com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.gateways;

import com.cleanarch.SPRINGBOOTCLEANARCH.application.gateways.UserGateway;
import com.cleanarch.SPRINGBOOTCLEANARCH.domain.entity.User;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence.UserEntity;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObject) {
        UserEntity userEntity = userEntityMapper.toEntity(userDomainObject);
       UserEntity savedObject = userRepository.save(userEntity);
       return userEntityMapper.toDomainObject(savedObject);
    }
}
