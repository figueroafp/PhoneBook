package com.campusdual;

public class Ejercicio9 {
   public static void repetirHasta(int max){
       int i = 0;

       do {
           System.out.println("Iteración número" + (i+1));
           i++;
       } while (i < max);
    }

    public static void main(String[] args) {
       repetirHasta(20);
    }
}

