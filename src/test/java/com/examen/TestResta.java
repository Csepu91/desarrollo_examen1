package com.examen;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestResta {

    @Test
    @Tag("unit")
    public void testResta() {
        int resultado = 5 - 2;
        assertEquals(3, resultado);
    }
}