package com.funong.newerp.common.exception;


import com.funong.newerp.common.result.ResultCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  参数无效异常
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
public class ParameterInvalidException extends BusinessException {
    private static final long serialVersionUID = 3721036867889297081L;

    public ParameterInvalidException() {
        super();
    }

    public ParameterInvalidException(Object data) {
        super();
        super.data = data;
    }

    public ParameterInvalidException(ResultCode resultCode) {
        super(resultCode);
    }

    public ParameterInvalidException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public ParameterInvalidException(String msg) {
        super(msg);
    }

    public ParameterInvalidException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
