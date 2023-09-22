package com.campusdual;

public class Ejercicio8 {
    public static void valormaxwhile(){
        int i = 0;
        int max = 1000;
        while (i < max){
            i++;
            System.out.println(i);
        }
        System.out.println("Valor maximo");
    };

    public static void main(String[] args) {
        //Realizar un bucle mientras una variable se incrementa hasta un valor tope (bucle while).
        valormaxwhile();
    }

}