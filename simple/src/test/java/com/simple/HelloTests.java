package com.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HelloTests {
    @Test
    public void testHello() {
        var controller = new HelloController();
        var result = controller.getCustomer();
        assertEquals (result.getId(), 1);
        assertEquals (result.getName(), "Srinivas");
        assertEquals (result.getEmail(), "mail@mail.com");
    }
}
