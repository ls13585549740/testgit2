package com.funong.newerp.dal.base;

import tk.mybatis.mapper.common.Marker;
import tk.mybatis.mapper.common.base.delete.DeleteByPrimaryKeyMapper;
import tk.mybatis.mapper.common.base.delete.DeleteMapper;
import tk.mybatis.mapper.common.condition.DeleteByConditionMapper;
import tk.mybatis.mapper.common.ids.DeleteByIdsMapper;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * 基础删除功能mapper
 *
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 12:46
 */
public interface DeleteDAO<T> extends Marker,
        DeleteMapper<T>,
        DeleteByPrimaryKeyMapper<T>,
        DeleteByConditionMapper<T>,
        DeleteByIdsMapper<T> {
}
