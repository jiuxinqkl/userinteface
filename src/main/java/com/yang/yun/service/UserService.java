package com.yang.yun.service;

import com.yang.yun.bean.UserAddress;

import java.util.List;

/**
 * @Author: yhy
 * @Date: 2018/8/29 18:03
 * @Version 1.0
 */
public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);

}
