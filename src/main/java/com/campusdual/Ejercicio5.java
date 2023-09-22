package com.campusdual;

public class Ejercicio5 {

    // Comprobar si un número es positivo o negativo

    public static void main(String[] args) {
    comprobarPositivo(0);

    // Comprobar si un número es múltiplo de otro
    System.out.println("Multiplos:" + comprobarMultiplo(4,2));

    // Comprobar que un número sea menor que otro
        comprobarNúmeroMenorQueOtro(10,20);
    }

    public static void comprobarPositivo (int number) {
        if (number >= 0) {
            System.out.println("Número Positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
    // Comprobar si un número es múltiplo de otro
    public static boolean comprobarMultiplo(int number1, int number2){
        if (number1 % number2 != 0) {
            return false;
        }    else {
                return true;
        }
    }

    // Comprobar que un número sea menor que otro
    public static void comprobarNúmeroMenorQueOtro (int number1, int number2){
        if (number1 == number2){
            System.out.println("Ambos Números son iguales");
        } else if (number1 < number2){
            System.out.println("Número menor");
        } else {
            System.out.println("Número mayor");
        }
    }
}


