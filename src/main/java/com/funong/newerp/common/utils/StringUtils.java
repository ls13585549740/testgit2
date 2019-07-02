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

    public static String join(Object[] array, String separator) {
        return array == null ? null : join((Object[])array, separator, 0, array.length);
    }

    public static String join(Object[] array, String separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        } else {
            if (separator == null) {
                separator = "";
            }

            int noOfItems = endIndex - startIndex;
            if (noOfItems <= 0) {
                return "";
            } else {
                StringBuilder buf = newStringBuilder(noOfItems);

                for(int i = startIndex; i < endIndex; ++i) {
                    if (i > startIndex) {
                        buf.append(separator);
                    }

                    if (array[i] != null) {
                        buf.append(array[i]);
                    }
                }

                return buf.toString();
            }
        }
    }

    private static StringBuilder newStringBuilder(int noOfItems) {
        return new StringBuilder(noOfItems * 16);
    }

}
