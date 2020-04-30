package com.microsoft.demo;

import org.junit.Test;

public class MyDemoTest {
    @Test
    public void testMyDemo() {
        MyDemo myDemo = new MyDemo();
        org.junit.Assert.assertEquals(myDemo.runDemo(), "this is demo");
    }
}
