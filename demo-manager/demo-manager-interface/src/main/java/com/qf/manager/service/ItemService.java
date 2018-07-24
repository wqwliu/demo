package com.qf.manager.service;

import com.qf.manager.pojo.dto.ItemQuery;
import com.qf.manager.pojo.dto.ItemResult;
import com.qf.manager.pojo.dto.PageParam;
import com.qf.manager.pojo.vo.TbItemCustom;

import java.util.List;

/**
 * @author wq
 * @create 2018/7/18 0018
 * @since 1.0.0
 */
public interface ItemService {
    ItemResult<TbItemCustom> showItemByPage(PageParam pageParam, ItemQuery itemQuery);

    int updateItemsByIds(List<Long> ids);
}
