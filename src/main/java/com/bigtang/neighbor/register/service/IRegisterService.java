package com.bigtang.neighbor.register.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bigtang.neighbor.register.po.RegisterEntity;
import com.bigtang.neighbor.register.request.RegisterRequest;

/**
 * @description：TODO
 * @author： intest
 * @create： 2024/1/2
 */
public interface IRegisterService extends IService <RegisterEntity>{
    /**
     * 通过手机号注册
     */
    public void registerWithPhone(RegisterRequest request);
}
