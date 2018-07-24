package com.qf.manager.dao;
import com.qf.manager.pojo.vo.TbItemCustom;

import java.util.List;
import java.util.Map;

/**
 *
 * @author wq
 * @create 2018/7/18 0018
 * @since 1.0.0
 */
public interface TbItemCostomMapper {

    long countItems(Map<String, Object> map);

    List<TbItemCustom> showItemByPage(Map<String, Object> map);
}
