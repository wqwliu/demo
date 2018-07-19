package com.qf.manager.service.impl;

import com.qf.manager.dao.TbItemCostomMapper;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbItem;
import com.qf.manager.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈Item的具体service〉
 *
 * @author wq
 * @create 2018/7/18 0018
 * @since 1.0.0
 */
@Service
public class ItemServiceImpl implements ItemService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private TbItemCostomMapper itemCostomDao;

    @Override
    public ItemResult<TbItem> showItemByPage(PageParam pageParam) {
        ItemResult<TbItem> result = new ItemResult<>();
        result.setCode(0);
        result.setMsg("select successful");
        try {
            //count
            long count = itemCostomDao.countItems();
            result.setCount(count);
            //data
            List<TbItem> list = itemCostomDao.showItemByPage(pageParam);
            result.setData(list);
        } catch (Exception e) {
            result.setCode(1);
            result.setMsg("select failed");
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
}