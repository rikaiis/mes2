package com.mall.mes2.service;

import com.mall.mes2.model.User;

public interface UserService {

    User findByUsername(String username);
}
