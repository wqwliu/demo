package com.qf.manager.dao;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.po.TbItem;

import java.util.List;

/**
 *
 * @author wq
 * @create 2018/7/18 0018
 * @since 1.0.0
 */
public interface TbItemCostomMapper {

    long countItems();

    List<TbItem> showItemByPage(PageParam pageParam);
}
