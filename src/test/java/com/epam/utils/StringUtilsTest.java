package com.epam.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
  
    @Test
    void isPositiveNumber_whenArgumentIsNull_thenReturnFalse() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }
}