package com.funong.newerp.common.result;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *  接口返回结果增强  会通过拦截器拦截后放入标记，在WebResponseBodyHandler进行结果处理
 * @author niuzhanjun
 * Date: 2019年7月1日
 * Time: 14:41
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
    Class<? extends Result>  value() default PlatformResult.class;
}
