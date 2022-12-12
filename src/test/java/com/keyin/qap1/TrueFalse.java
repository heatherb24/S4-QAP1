package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrueFalse {

    @Test
    public void test1(){
        String str = "coding";
        System.out.println(str);
        Assertions.assertTrue(str.length() == 6);
    }

    @Test
    public void test3(){
        String str = "code";
        System.out.println(str);
        Assertions.assertFalse(str.startsWith("La"));
    }

    @Test
    public void test5(){
        String str = "hello world";
        System.out.println(str);
        Assertions.assertNotNull(str);
    }
}