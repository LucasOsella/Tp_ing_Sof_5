/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import tp5_nuevo.Conversor;
import static org.junit.Assert.assertEquals;

public class ConversorTest {

    private static Conversor conversor;

    @BeforeClass
    public static void setUpBeforeClass() {
        conversor = new Conversor(500);
        System.out.println("Bienvenido al Test de Conversor de Monedas");
    }

    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Test
    public void testAumentarSaldo() {
        conversor.aumentarSaldo(100);
        assertEquals(600, conversor.getSaldoUSD(), 0.001);
    }

    @Test
    public void testConvertir() {
        double resultado = conversor.convertir(1000, 1200);
        assertEquals(1200000, resultado, 0.001);
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("La operación ha finalizado");
    }
}

