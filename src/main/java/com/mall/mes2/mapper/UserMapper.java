package com.mall.mes2.mapper;

import com.mall.mes2.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User findByUsername(@Param("username") String username);
}
