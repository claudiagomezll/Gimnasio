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
public class CuentaConjunta extends CuentaBancaria //Herencia de la clase

{
    private String Titular2; //Otro titular de una cuenta conjunta
    
public CuentaConjunta () {} //constructor nulo
public CuentaConjunta (int n,double b,String prop1,String prop2)
{
super (n, b, prop1); //llama al constructor de la superclase
Titular2 = prop2;
}

}

    

