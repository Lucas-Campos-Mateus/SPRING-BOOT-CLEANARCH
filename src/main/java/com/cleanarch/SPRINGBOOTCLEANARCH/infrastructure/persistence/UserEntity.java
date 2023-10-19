package com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;

@Entity (name = "user_clean_arch")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String password;
    private String email;


    public UserEntity(String user_name, String password, String email) {
        this.user_name = user_name;
        this.password= password;
        this.email = email;
    }
}