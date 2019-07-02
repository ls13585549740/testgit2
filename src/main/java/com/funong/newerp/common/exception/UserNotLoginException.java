package com.funong.newerp.common.exception;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  用户未登录
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
public class UserNotLoginException extends BusinessException {
    private static final long serialVersionUID = -1879503946782379204L;

    public UserNotLoginException() {
        super();
    }

    public UserNotLoginException(String msg) {
        super(msg);
    }

    public UserNotLoginException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
