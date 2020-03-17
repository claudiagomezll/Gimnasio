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
public class CuentaCorriente extends CuentaBancaria
{
    
    private static float Saldo_Minimo = 2500;//por encima, operativa
//gratis
private static float Comision = 18; //comision para saldos
//inferiores
private boolean gratuita;


public CuentaCorriente () {} //constructor nulo
public CuentaCorriente (int n, double b, String prop)
{
super (n, b, prop);
  
gratuita = (b >= Saldo_Minimo);
}
public static void Cambiar_Saldo_Minimo (float m)
{Saldo_Minimo = m;}

public static void Cambiar_Comision (float f)
{Comision = f;}

public boolean Reintegro (double Cantidad)
{
boolean Resultado = super.Reintegro (Cantidad); //procesamiento
//general
if (Resultado && (Saldo ()<Saldo_Minimo)) //procesamiento
//especifico
gratuita = false;
return (Resultado);
}

public boolean Cobro_Comision () //cargo mensual, si procede
{
boolean Resultado;
if (!gratuita)
{ if (Resultado = Reintegro (Comision))
gratuita = (Saldo ()>=Saldo_Minimo);
return (Resultado);
}
return (true);
}

}
