package com.qf.manager.pojo.dto;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈item的分页数据〉
 *
 * @author wq
 * @create 2018/7/18 0018
 * @since 1.0.0
 */
public class ItemResult<T> {
    private int code;
    private String msg;
    private long count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}