package com.darkblade.register.service;

import com.darkblade.common.test.TestService;
import com.darkblade.rpc.register.annotation.RpcService;

@RpcService
public class TestServiceImpl implements TestService {

    @Override
    public String userInfo(String username) {
        return username;
    }

}
