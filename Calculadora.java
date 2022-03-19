package javaapplication3;

import static javaapplication3.Main.num1;
import static javaapplication3.Main.num2;

public class Calculadora {

    private double resultado;
 

    //constructor - sirve para iniciarlizar variables y recursos de la clase
  
    //metodos
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero+segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero){
        return primerNumero-segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero/segundoNumero;
    }

    @SuppressWarnings("empty-statement")
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero*segundoNumero;
    }
    
    public double multiplicar(double num, double num2){
        return resultado = Math.pow(num1,num2);
    }
    
    public double potencia(double primerNumero, double segundoNumero){
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        double resultado = Math.sqrt(num1);return 0;

    }

    
}