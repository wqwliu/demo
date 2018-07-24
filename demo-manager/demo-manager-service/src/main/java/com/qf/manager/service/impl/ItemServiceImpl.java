package com.qf.manager.service.impl;

import com.qf.manager.dao.TbItemCostomMapper;
import com.qf.manager.dao.TbItemMapper;
import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbItem;
import com.qf.manager.pojo.po.TbItemExample;
import com.qf.manager.pojo.vo.TbItemCustom;
import com.qf.manager.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Autowired
    private TbItemMapper itemDao;

    @Override
    public ItemResult<TbItemCustom> showItemByPage(PageParam pageParam, ItemQuery itemQuery) {
        ItemResult<TbItemCustom> result = new ItemResult<>();
        result.setCode(0);
        result.setMsg("select successful");
        try {
            //新建一个map来放查询需要的各个对象
            Map<String, Object> map = new HashMap<>();
            map.put("pageParam",pageParam);
            map.put("itemQuery",itemQuery);
            //count
            long count = itemCostomDao.countItems(map);
            result.setCount(count);
            //data
            List<TbItemCustom> list = itemCostomDao.showItemByPage(map);
            result.setData(list);
        } catch (Exception e) {
            result.setCode(1);
            result.setMsg("select failed");
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int updateItemsByIds(List<Long> ids) {
        int i = 0;

        try {
            //创建TbItem对象
            TbItem tbItem = new TbItem();
            tbItem.setStatus((byte) 3);
            //创建模板
            TbItemExample example = new TbItemExample();
            TbItemExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);
            //执行更新操作
            i = itemDao.updateByExampleSelective(tbItem, example);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return i;
    }
}