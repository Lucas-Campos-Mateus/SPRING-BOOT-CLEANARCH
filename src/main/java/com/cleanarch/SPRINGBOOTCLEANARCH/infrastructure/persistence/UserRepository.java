package com.cleanarch.SPRINGBOOTCLEANARCH.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Long> {


}
