package com.cleanarch.SPRINGBOOTCLEANARCH.application.gateways;

import com.cleanarch.SPRINGBOOTCLEANARCH.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
