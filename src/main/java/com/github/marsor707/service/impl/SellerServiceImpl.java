package com.github.marsor707.service.impl;

import com.github.marsor707.dataobject.SellerInfo;
import com.github.marsor707.repository.SellerInfoRepository;
import com.github.marsor707.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
