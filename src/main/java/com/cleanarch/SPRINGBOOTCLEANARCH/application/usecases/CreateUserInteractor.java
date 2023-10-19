package com.cleanarch.SPRINGBOOTCLEANARCH.application.usecases;

import com.cleanarch.SPRINGBOOTCLEANARCH.application.gateways.UserGateway;
import com.cleanarch.SPRINGBOOTCLEANARCH.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }
}
