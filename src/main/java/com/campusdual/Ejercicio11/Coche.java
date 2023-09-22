package com.campusdual.Ejercicio11;

public class Coche {
    public String brand;
    public String model;
    public static final int MAX_SPEED = 200;
    public String fuel ="";
    public int speedometer = 0;
    public int tachometer = 0;
    public int girarVolante = 0;
    public boolean reverse;
    public Coche(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public void start() {
        if (this.tachometer == 0) {
            this.tachometer = 1000;
            System.out.println("Coche encendido");
        } else {
            System.out.println("El coche ya esta encendido");
        }
    }

    public void acelerate(){
        while (this.speedometer < Coche.MAX_SPEED){
            this.speedometer += 10;
            System.out.println("Acelera a:" + this.speedometer);
        }
        System.out.println("Velocidad maxima alcanzada");
    }

    public void brake(){
        while (this.speedometer > 0) {
            this.speedometer -= 10;
            System.out.println("Coche frenando a:" + this.speedometer);
        }
                System.out.println("El coche se detuvo");
    }

    public void stop(){
        if (this.speedometer == 0){
            this.tachometer = 0;
            System.out.println("Coche Apagado");
        } else {
            System.out.println("El coche no se puede apagar en movimiento");
        }
    }

    public void girarVolante(int giro){
        this.girarVolante = giro;
                if (180 < this.girarVolante && this.girarVolante < 360) {
            System.out.println("El coche gira a la derecha");
        } else if (girarVolante == 180){
            System.out.println("El coche sigue recto");
        } else {
            System.out.println("El coche gira a la izquierda");
        }
    }

    public void reverse() {
        if (this.speedometer == 0){
            if (this.reverse == true){
                System.out.println("El coche cambia a marcha adelante");
                this.reverse = false;
            } else {
                System.out.println("El coche cambia a marcha atrás");
                this.reverse = true;
            }
        } else{
            System.out.println("No puedes poner la marcha atras en movimiento");
        }
    }

    public static void main(String[] args){
        Coche coche1= new Coche("Citroen", "Xsara", "Diésel");
        Coche coche2= new Coche("Toyota", "Avensis", "Diésel");
        System.out.println(coche1.brand + " " + coche1.model);
        System.out.println(coche2.brand);
        System.out.println(coche1.tachometer);
        coche1.start();
        coche1.acelerate();
        coche1.brake();
        coche1.girarVolante(150);
    }
}
