package com.epam.utils;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
    public static boolean isPositiveNumber(String str){
        if(isNotBlank(str) & isNumeric(str)){
            return Integer.parseInt(str)>0;
        }
        return false;
    }
}
