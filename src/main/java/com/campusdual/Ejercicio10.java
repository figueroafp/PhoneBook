package com.campusdual;

import java.util.Random;

public class Ejercicio10 {



    public static int numeroAleatorioEnUnRango(int min, int max){
        Random random = new Random();
        max++;
        return random.nextInt(max - min) + min;
    }

    public static void sacarPelotitas(int max){

        for (int i = 0; i < max; i++){
            int aleatorio = numeroAleatorioEnUnRango(3,5);
            if (aleatorio == 3){
                System.out.println("Pelota azul");
            }else if (aleatorio == 4) {
                System.out.println("Pelota verde");
            }else {
                System.out.println("Pelota roja");
            }
        }
    }

    public static void main(String[] args) {
        sacarPelotitas(20);
    }
}