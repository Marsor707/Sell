package com.github.marsor707.service;

import com.github.marsor707.dataobject.SellerInfo;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);
}
