package com.funong.newerp.common.utils;

public class StringUtils {

    public static String trim(String s, String f) {
        if (null == s || "".equals(s)) return s;
        if (f.equals(s.substring(0, 1))) {
            s = s.substring(1);
        }
        if (f.equals(s.substring(s.length() - 1))) {
            s = s.substring(0, s.length() - 1);
        }
        return s;
    }


}
