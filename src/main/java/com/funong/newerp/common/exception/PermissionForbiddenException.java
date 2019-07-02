package com.funong.newerp.common.exception;


import com.funong.newerp.common.result.ResultCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  权限不足异常
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
public class PermissionForbiddenException extends BusinessException {
    private static final long serialVersionUID = 3721036867889297081L;

    public PermissionForbiddenException() {
        super();
    }

    public PermissionForbiddenException(Object data) {
        super.data = data;
    }

    public PermissionForbiddenException(ResultCode resultCode) {
        super(resultCode);
    }

    public PermissionForbiddenException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public PermissionForbiddenException(String msg) {
        super(msg);
    }

    public PermissionForbiddenException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
