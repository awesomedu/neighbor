package com.bigtang.neighbor.register.po;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @description：TODO
 * @author： intest
 * @create： 2024/1/2
 */

@TableName("sys_register")
public class RegisterEntity {
    /**
     * 手机号
     */
    private String phoneNum;

    /**
     * sex
     */
    private String sex;

    /**
     * 住户信息
     */
    private String locationInfo;
}
