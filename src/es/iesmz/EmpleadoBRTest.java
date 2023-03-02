package es.iesmz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadoBRTest {

    @Test
    public void testCalculaSalarioBruto1(){
        float resultadoReal = EmpleadoBR.calculaSalarioBruto(TipoEmpleado.venedor, 2000.0f, 8.0f);
        float resultadoEsperado = 1360.0f;

        assertEquals(resultadoEsperado, resultadoReal, 0.01);
    }
}