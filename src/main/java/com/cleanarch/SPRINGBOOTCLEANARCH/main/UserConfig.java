package com.cleanarch.SPRINGBOOTCLEANARCH.main;

import com.cleanarch.SPRINGBOOTCLEANARCH.application.gateways.UserGateway;
import com.cleanarch.SPRINGBOOTCLEANARCH.application.usecases.CreateUserInteractor;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.controllers.UserDTOMapper;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.gateways.UserEntityMapper;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.gateways.UserRepositoryGateway;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }
}
