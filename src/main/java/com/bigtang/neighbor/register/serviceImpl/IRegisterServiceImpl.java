package com.bigtang.neighbor.register.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bigtang.neighbor.register.mapper.RegisterMapper;
import com.bigtang.neighbor.register.po.RegisterEntity;
import com.bigtang.neighbor.register.request.RegisterRequest;
import com.bigtang.neighbor.register.service.IRegisterService;
import org.springframework.stereotype.Service;

/**
 * @description：TODO
 * @author： intest
 * @create： 2024/1/2
 */
@Service
public class IRegisterServiceImpl extends ServiceImpl<RegisterMapper,RegisterEntity> implements IRegisterService {
    private RegisterMapper registerMapper;
    @Override
    public void registerWithPhone(RegisterRequest request) {

    }
}
