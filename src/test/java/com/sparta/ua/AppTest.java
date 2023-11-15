package com.sparta.ua;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest{

    @Test
    public void DifferentNumbers(){
        Assertions.assertEquals("DC",App.getRoman3(600));
        Assertions.assertEquals("IV",App.getRoman3(4));
        Assertions.assertEquals("IX",App.getRoman3(9));
        Assertions.assertEquals("XXIX",App.getRoman3(29));
        Assertions.assertEquals("LXXX",App.getRoman3(80));
        Assertions.assertEquals("CCXCIV",App.getRoman3(294));
        Assertions.assertEquals("MMXIX",App.getRoman3(2019));
    }
}
