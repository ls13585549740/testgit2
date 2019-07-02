package com.funong.newerp.common.exception;

import com.funong.newerp.common.result.ResultCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  数据已存在
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
public class DataConflictException extends BusinessException {
    private static final long serialVersionUID = 3721036867889297081L;

    public DataConflictException() {
        super();
    }

    public DataConflictException(Object data) {
        super();
        super.data = data;
    }

    public DataConflictException(ResultCode resultCode) {
        super(resultCode);
    }

    public DataConflictException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public DataConflictException(String msg) {
        super(msg);
    }

    public DataConflictException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
