package org.com.yzh.dubbo.service;

import org.com.yzh.dubbo.domain.OrderRequest;
import org.com.yzh.dubbo.domain.OrderResponse;

/**
 * @ClassName: org.com.yzh.dubbo.service
 * @Description:
 * @Author: yin.zhh
 * @Date 2018/7/18 23:14
 * @Version v.1.0.0
 */
public interface IoOrderService {
    /**
     * 下单接口
     * @param request 请求参数
     * @return 响应结果
     */
    OrderResponse doOrder(OrderRequest request);
}
