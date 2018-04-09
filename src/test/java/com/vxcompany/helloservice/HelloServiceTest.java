package com.vxcompany.helloservice;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloServiceTest {
    private HelloService service = new HelloService();

    @Test
    public void sayHello_WhenCalledWithName_ShouldReturnMessage() {
        String expected = "Hello Dennis from Hello Service.";
        String result = service.sayHello("Dennis");

        assertEquals(expected, result);
    }

    @Test
    public void sayHello_WhenCalledWithNullValue_ShouldReturnMessage() {
        String expected = "Hello World from Hello Service.";
        String result = service.sayHello(null);

        assertEquals(expected, result);
    }
}