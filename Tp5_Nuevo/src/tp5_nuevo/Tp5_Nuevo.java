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
public class Tp5_Nuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conversor con = new Conversor(2000);
        //System.out.println("Su sueldo convertido a pesos es igual a "+con.convertir(2000, 993.74));
        //System.out.println("Cotizacion "+con.calcularCotizacion(1650, 1800000));
          con.aumentarSaldo(500);
//        System.out.println("Su saldo actual es de "+con.getSaldoUSD());
          con.retirarFisico(100);
          System.out.println("Su saldo despues de retirar es de "+con.getSaldoUSD());
            
    }
    
}
