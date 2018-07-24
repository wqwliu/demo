package com.qf.manager.pojo.vo;

import com.qf.manager.pojo.po.TbItem;

/**
 * 〈一句话功能简述〉<br>
 * 〈多表item 业务bean〉
 *
 * @author wq
 * @create 2018/7/22 0022
 * @since 1.0.0
 */
public class TbItemCustom extends TbItem{
    private String catName;

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}