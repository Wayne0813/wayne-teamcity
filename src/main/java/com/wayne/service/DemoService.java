package com.wayne.service;

import com.wayne.common.R;
import com.wayne.entity.DemoUser;

/**
 * @Author Wayne
 * @Date 2019-09-29
 */
public interface DemoService {
    R getUserById(Integer id);

    R updateUserById(DemoUser user);

    R createUser(DemoUser user);

    R deleteUserById(Integer id);
}
