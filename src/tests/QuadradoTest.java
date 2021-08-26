package tests;

import models.Quadrado;
import org.junit.jupiter.api.Test;

class QuadradoTest {

    @Test
    void getArea() {

        Quadrado quadrado = new Quadrado(2,3);
        quadrado.calcularArea();

        System.out.println("zdthzdtj");
        equals(quadrado);

    }
}