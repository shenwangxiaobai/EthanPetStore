package com.petstore.dao;

import com.petstore.entity.Users;

public interface UsersDao {

    Users selectById(Integer userId);

    // 以上为mybatis generator自动生成接口, 具体实现在mapper.xml中

    // ------------------------------------------------------------

    // 以下方法使用mybatis注解实现

}
