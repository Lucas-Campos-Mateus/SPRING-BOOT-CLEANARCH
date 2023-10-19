package com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.controllers;

import com.cleanarch.SPRINGBOOTCLEANARCH.application.usecases.CreateUserInteractor;
import com.cleanarch.SPRINGBOOTCLEANARCH.domain.entity.User;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.gateways.UserRepositoryGateway;
import com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserInteractor createUserUseCase;
    private final UserDTOMapper userDTOMapper;
    public UserController(CreateUserInteractor createUserUseCase, UserDTOMapper userDTOMapper){
        this.createUserUseCase = createUserUseCase;
        this.userDTOMapper = userDTOMapper;
    }




    @PostMapping
    public CreateUserResponse createUser(@RequestBody CreateUserRequest request){
    User userBusinessObject = userDTOMapper.toUser(request);
      User user =  createUserUseCase.createUser(userBusinessObject);
        return userDTOMapper.toResponse(user);
    }
}
