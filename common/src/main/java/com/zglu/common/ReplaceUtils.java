package com.zglu.common;

import lombok.extern.log4j.Log4j2;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符替换工具
 *
 * @author zglu
 */
@Log4j2
public class ReplaceUtils {

    private ReplaceUtils() {
    }

    public static final Pattern PATTERN_UPPERCASE = Pattern.compile("[A-Z]");

    /**
     * java属性名转换成数据库字段名
     *
     * @param fieldName 属性名
     * @return 字段名
     */
    public static String getColumnName(String fieldName) {
        String str = Optional.ofNullable(fieldName).orElse("");
        Matcher matcher = PATTERN_UPPERCASE.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

}
