package com.wayne.impl;

import com.wayne.common.R;
import com.wayne.common.config.ServerConfig;
import com.wayne.entity.DemoUser;
import com.wayne.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Wayne
 * @Date 2019-09-29
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private ServerConfig serverConfig;

    @Override
    public R getUserById(Integer id) {
        if (null == id) {
            return R.error("ID不能为空").put("PORT", serverConfig.getPort());
        }

        DemoUser user = new DemoUser();
        user.setUserId(id);
        user.setUsername("Wayne-" + id);

        return R.ok().put("data", user).put("PORT", serverConfig.getPort());
    }

    @Override
    public R updateUserById(DemoUser user) {
        if (null == user) {
            return R.error("参数不能为空").put("PORT", serverConfig.getPort());
        }

        if (null == user.getUserId() || null == user.getUsername()) {
            return R.error("参数异常").put("PORT", serverConfig.getPort());
        }

        return R.ok("更新成功，更新后[ID:" + user.getUserId() + "][username:" + user.getUsername()).put("PORT", serverConfig.getPort());
    }

    @Override
    public R createUser(DemoUser user) {
        if (null == user) {
            return R.error("参数不能为空").put("PORT", serverConfig.getPort());
        }

        if (null == user.getUsername()) {
            return R.error("参数异常").put("PORT", serverConfig.getPort());
        }

        return R.ok("新增成功，新增后[username:" + user.getUsername()).put("PORT", serverConfig.getPort());
    }

    @Override
    public R deleteUserById(Integer id) {
        if (null == id) {
            return R.error("ID不能为空").put("PORT", serverConfig.getPort());
        }

        return R.ok("删除成功，删除[ID:" + id + "]").put("PORT", serverConfig.getPort());
    }
}
