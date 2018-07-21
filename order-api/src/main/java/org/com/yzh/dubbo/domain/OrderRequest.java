package org.com.yzh.dubbo.domain;

import java.io.Serializable;

/**
 * @ClassName: OrderRequest
 * @Description:
 * @Author: yin.zhh
 * @Date 2018-07-18 23:17
 * @Version v.1.0.0
 */
public class OrderRequest implements Serializable{

    private static final long serialVersionUID = -7556160124322476342L;
    private String name;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
