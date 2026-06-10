package com.dam.practicajunit;
import com.dam.practicajunit.Circulo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    @Test 
    public void testConstructorVacio() {
        Circulo c = new Circulo();
        assertEquals(0.0, c.getRadio(), 0.0);
    }
}