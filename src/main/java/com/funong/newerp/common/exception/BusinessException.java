package com.funong.newerp.common.exception;

import com.funong.newerp.common.result.ResultCode;
import lombok.Data;
import org.springframework.util.StringUtils;


/**
 * Created with IntelliJ IDEA.
 * Description:
 *  业务异常类
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
@Data
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 2332608236621015980L;

    protected String code;

    protected String message;

    protected ResultCode resultCode;

    protected Object data;

    public BusinessException() {

    }

    public BusinessException(String message) {
        this();
        this.message = message;
    }

    public BusinessException(String format, Object... objects) {
        this();
        format = StringUtils.replace(format, "{}", "%s");
        this.message = String.format(format, objects);
    }

    public BusinessException(ResultCode resultCode, Object data) {
        this(resultCode);
        this.data = data;
    }

    public BusinessException(ResultCode resultCode) {
        this.resultCode = resultCode;
        this.code = resultCode.code().toString();
        this.message = resultCode.message();
    }
}
