/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Claudia
 */
public class Cuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        CuentaConjunta AntonioyJuan;
AntonioyJuan = new CuentaConjunta (1234, 25000, "Antonio Lopez", "Juan Perez");
AntonioyJuan.Deposito (25000);
System.out.println (AntonioyJuan.Saldo () );
        // TODO code application logic here
    }
    
}
