package com.funong.newerp.common.exception;

import com.funong.newerp.common.result.ResultCode;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  远程访问时错误
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
public class RemoteAccessException extends BusinessException {
    private static final long serialVersionUID = -832464574076215195L;

    public RemoteAccessException() {
        super();
    }

    public RemoteAccessException(Object data) {
        super.data = data;
    }

    public RemoteAccessException(ResultCode resultCode) {
        super(resultCode);
    }

    public RemoteAccessException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public RemoteAccessException(String msg) {
        super(msg);
    }

    public RemoteAccessException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
