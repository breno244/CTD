package Aula1.mesa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadradoTest {

    @Test

    public void validarPerimetroQuadrado(){
        Quadrado q1= new Quadrado(2);
        Quadrado q2= new Quadrado(1);

        assertEquals("8,00",String.format("%.2f",q1.calcularPerimetro()));
        assertEquals("4,00",String.format("%.2f",q2.calcularPerimetro()));

        System.out.println(q1.calcularPerimetro());
        System.out.println(q2);
    }

}