package com.bigtang.neighbor.register.controller;

import com.bigtang.neighbor.register.request.RegisterRequest;
import com.bigtang.neighbor.register.service.IRegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：TODO
 * @author： intest
 * @create： 2024/1/2
 */

@Slf4j
@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private IRegisterService registerService;
    @PostMapping("/registerAccount")
    private void register(@RequestBody RegisterRequest request){
        registerService.registerWithPhone(request);
    }
}
