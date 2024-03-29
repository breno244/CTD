package Aula1.mesa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @BeforeEach

    @Test
    public void validarPerimetroQuadrado(){
        Circulo circulo = new Circulo(4);
        Circulo circulo2 = new Circulo(5);

        assertEquals("25,12",String.format("%.2f",circulo.calcularPerimetro()));
        assertEquals("31,40",String.format("%.2f",circulo2.calcularPerimetro()));

        System.out.println(circulo);
        System.out.println(circulo2);

    }


}