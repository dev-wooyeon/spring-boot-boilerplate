package com.boilerplate.springbootapi.domain.user.repository;

import com.boilerplate.springbootapi.domain.user.entity.UserEntity;
import com.boilerplate.springbootapi.domain.user.repository.querydsl.UserRepositoryQueryDSL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>, UserRepositoryQueryDSL {}
