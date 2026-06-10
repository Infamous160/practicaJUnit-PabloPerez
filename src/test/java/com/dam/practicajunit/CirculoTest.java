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
@Test
    public void testGetRadio() {
        Circulo c = new Circulo(5.0);
        assertEquals(5.0, c.getRadio(), 0.0);
    }
    @Test
    public void testSetRadio() {
        Circulo c = new Circulo(3.0);
        c.setRadio(7.5);
        assertEquals(7.5, c.getRadio(), 0.0);
    }
    @Test
    public void testCalcularArea() {
        Circulo c = new Circulo(1.0);
        double areaEsperada = Math.PI * Math.pow(1.0, 2);
        assertEquals(areaEsperada, c.calcularArea(), 0.0);
    }