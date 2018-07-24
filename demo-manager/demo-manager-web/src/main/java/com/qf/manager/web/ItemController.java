package com.qf.manager.web;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.vo.TbItemCustom;
import com.qf.manager.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
    public ItemResult<TbItemCustom> ShowItem(PageParam pageParam,ItemQuery itemQuery){
        ItemResult<TbItemCustom> list = null;
        try {
            list = itemService.showItemByPage(pageParam,itemQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @ResponseBody
    @RequestMapping(value ="/item/batch",method = RequestMethod.POST)
    public int removeItems(@RequestParam("ids[]")List<Long> ids){
        int i = 0;
        try {
          i = itemService.updateItemsByIds(ids);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}