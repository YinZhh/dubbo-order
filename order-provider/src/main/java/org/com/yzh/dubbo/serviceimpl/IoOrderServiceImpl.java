package org.com.yzh.dubbo.serviceimpl;

import org.com.yzh.dubbo.domain.OrderRequest;
import org.com.yzh.dubbo.domain.OrderResponse;
import org.com.yzh.dubbo.service.IoOrderService;

/**
 * @ClassName: IoOrderServiceImpl
 * @Description:
 * @Author: yin.zhh
 * @Date 2018-07-18 23:30
 * @Version v.1.0.0
 */
public class IoOrderServiceImpl implements IoOrderService {

    @Override
    public OrderResponse doOrder(OrderRequest request) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setCode(200);
        orderResponse.setMasssege("处理成功！");
        orderResponse.setData(request);
        System.out.println("【request请求成功！】 orderResponse=" + orderResponse);
        return orderResponse;
    }
}
