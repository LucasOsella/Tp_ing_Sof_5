/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import tp5_nuevo.Conversor;
public class CotizacionTest {

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        Conversor conversor = new Conversor(500);
        conversor.calcularCotizacion(1800000, 0);
    }
}

