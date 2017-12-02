package com.github.marsor707.service;

import com.github.marsor707.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在售商品
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // TODO: 2017/12/2 加库存

    // TODO: 2017/12/2 减库存
}
