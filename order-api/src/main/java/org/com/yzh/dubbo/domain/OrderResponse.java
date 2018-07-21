package org.com.yzh.dubbo.domain;

import java.io.Serializable;

/**
 * @ClassName: OrderResponse
 * @Description:
 * @Author: yin.zhh
 * @Date 2018-07-18 23:18
 * @Version v.1.0.0
 */
public class OrderResponse implements Serializable {
    private static final long serialVersionUID = -8128971089943531514L;
    private int code;

    private String masssege;

    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMasssege() {
        return masssege;
    }

    public void setMasssege(String masssege) {
        this.masssege = masssege;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "OrderResponse{" +
                "code=" + code +
                ", masssege='" + masssege + '\'' +
                ", data=" + data +
                '}';
    }
}
