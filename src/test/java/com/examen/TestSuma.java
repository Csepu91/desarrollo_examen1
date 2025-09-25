package com.examen;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSuma {
    @Test
    @Tag("unit")
    public void testSuma() {
        int resultado = 2 + 3;
        assertEquals(5, resultado);
    }

}
