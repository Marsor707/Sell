package com.github.marsor707.service;

import com.github.marsor707.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);
}
