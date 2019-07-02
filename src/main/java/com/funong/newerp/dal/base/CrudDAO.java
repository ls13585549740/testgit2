package com.funong.newerp.dal.base;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  基础增删改查功能mapper
 * @author niuzhanjun
 * Date: 2019年7月2日09:15:10
 */
public interface CrudDAO<T> extends
        InsertDAO<T>,
        DeleteDAO<T>,
        UpdateDAO<T>,
        SelectDAO<T> {
}
