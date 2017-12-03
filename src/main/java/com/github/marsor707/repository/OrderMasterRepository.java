package com.github.marsor707.repository;

import com.github.marsor707.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
