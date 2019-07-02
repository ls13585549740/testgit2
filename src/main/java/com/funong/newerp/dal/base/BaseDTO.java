package com.funong.newerp.dal.base;


import java.io.Serializable;
import java.lang.reflect.Field;
import com.alibaba.fastjson.JSON;

public class BaseDTO implements Serializable {

    public String build(String template) {
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            String fieldName = field.getName();
            String fieldValue = "";
            try {
                fieldValue=JSON.toJSONString(field.get(this));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            String flagChar = "#" + fieldName + "#";
            template = template.replace(flagChar, fieldValue);
        }
        return template;
    }
}
