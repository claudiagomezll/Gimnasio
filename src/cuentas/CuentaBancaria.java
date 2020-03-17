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
public class CuentaBancaria {
    
protected int Codigo_Cuenta; //Codigo Cuenta Cliente
protected String Titular; //Titular de la Cuenta
private double Saldo_Cuenta; //Saldo Actual
    

public CuentaBancaria () {} //constructor nulo
public CuentaBancaria (int id, double disponible, String propietario)
{ Codigo_Cuenta=id;
Saldo_Cuenta=disponible;
Titular=propietario;
}
public double Saldo()
{return (Saldo_Cuenta);}

public void Deposito (double Cantidad)
{if (Saldo_Cuenta>0) Saldo_Cuenta=Saldo_Cuenta+Cantidad;}

public boolean Reintegro (double Cantidad)
{
    if (Cantidad <=0)||(Cantidad>Saldo_Cuenta)
        return (false);
else Saldo_Cuenta=Saldo_Cuenta-Cantidad;
return (true);

}


public int Codigo ()
{return (Codigo_Cuenta);}


}



