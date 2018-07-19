package com.qf.manager.web;

import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbItem;
import com.qf.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author wq
 * @create 2018/7/18 0018
 * @since 1.0.0
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @ResponseBody
    @RequestMapping(value = "/items",method = RequestMethod.GET)
    public ItemResult<TbItem> ShowItem(PageParam pageParam){
        ItemResult<TbItem> list = null;
        try {
            list = itemService.showItemByPage(pageParam);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}