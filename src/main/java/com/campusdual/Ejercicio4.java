package com.campusdual;

public class Ejercicio4 {

    // Sumar los 5 primeros números naturales
    // Sumar los 20 primeros números pares
    // Calcular el factorial de un número. Factorial de 5: 5*4*3*2*1

    public static int sumaNatural(){
        int resultado = 1+2+3+4+5;
        return resultado;
    }

    public static void main(String[] args) {
        int resultado5 = sumaNatural();
        System.out.println("El resultado de los 5 primeros números naturales es:" + resultado5);
    }
}
