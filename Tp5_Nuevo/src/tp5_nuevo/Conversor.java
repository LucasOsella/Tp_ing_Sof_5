/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5_nuevo;

/**
 *
 * @author Lucas
 */
    public class Conversor {

    private double saldoUSD;

    // Constructor
    public Conversor(double saldoUSD) {
        this.saldoUSD = saldoUSD;
    }

    // Método para convertir de una moneda a otra
    public double convertir(double monto, double tasaCambio) {
        return monto * tasaCambio;
    }

    // Método para calcular cotización
    public double calcularCotizacion(double montoUSD, double montoLocal) {
        if (montoLocal == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        return montoLocal / montoUSD;
    }

    // Método para aumentar el saldo
    public void aumentarSaldo(double monto) {
        saldoUSD += monto;
    }

    // Método para extraer en billetes físicos
    public void retirarFisico(double monto) {
        if (monto % 100 != 0) {
            throw new IllegalArgumentException("Monto debe ser múltiplo de 100");
        }
        saldoUSD -= monto;
    }

    public double getSaldoUSD() {
        return saldoUSD;
    }
}

    
