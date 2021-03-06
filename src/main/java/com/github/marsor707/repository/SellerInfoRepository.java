package com.github.marsor707.repository;

import com.github.marsor707.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);
}
