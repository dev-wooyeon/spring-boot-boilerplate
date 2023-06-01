package com.boilerplate.springbootapi.domain.user.repository.querydsl;

import com.boilerplate.springbootapi.domain.user.domain.UserEntity;

public interface UserRepositoryQueryDSL {

    // 예를 들어, 유저 + 구매 정보를 함께 가지고 오는 정보가 필요하다.
    void findByUserAndPurchaseInfo(Integer userId);

}
