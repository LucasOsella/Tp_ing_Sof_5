/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import tp5_nuevo.Conversor;

@RunWith(Parameterized.class)
public class DolaritosTest {

    private final double montoUSD;
    private final double montoLocal;
    private final Double esperado;

    public DolaritosTest(double montoUSD, double montoLocal, Double esperado) {
        this.montoUSD = montoUSD;
        this.montoLocal = montoLocal;
        this.esperado = esperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][]{
                {180000, 1620000, 9.0},
                {120000, 0, null}, // Este caso debe lanzar la excepción
                {100000, -900, -0.009}
        });
    }

    @Test
    public void testCalcularCotizacion() {
        Conversor conversor = new Conversor(500);
        try {
            double resultado = conversor.calcularCotizacion(montoUSD, montoLocal);
            if (esperado == null) {
                fail("Se esperaba una ArithmeticException al dividir por cero");
            } else {
                assertEquals(esperado, resultado, 0.001);
            }
        } catch (ArithmeticException e) {
            if (esperado != null) {
                fail("No se esperaba una ArithmeticException para estos valores");
            }
        }
    }
}


