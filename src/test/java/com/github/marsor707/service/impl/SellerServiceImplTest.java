package com.github.marsor707.service.impl;

import com.github.marsor707.dataobject.SellerInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    private static final String openid = "abc";

    @Autowired
    private SellerServiceImpl sellerService;

    @Test
    public void findSellerInfoByOpenid() throws Exception {
        SellerInfo result = sellerService.findSellerInfoByOpenid(openid);
        Assert.assertEquals(openid, result.getOpenid());
    }

}