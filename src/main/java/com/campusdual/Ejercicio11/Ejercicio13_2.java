package com.campusdual.Ejercicio11;

public class Ejercicio13_2 {

    public int actualFuel = 10;

    public int getActualFuel() {
        return this.actualFuel;
    }

    public void setActualFuel(int actualFuel) {
        if (actualFuel >= 0) {
            this.actualFuel = actualFuel;
        } else {
            System.out.println("La capacidad no puede ser negativa");
        }
    }

    public void showDetails() {
        System.out.println("La capacidad actual es de " + this.getActualFuel() + " litros.");
    }

    public static void main(String[] args) {
        Ejercicio13_2 cO = new Ejercicio13_2();
        cO.showDetails();
        System.out.println("Actualización capacidad");
        cO.setActualFuel(-8);
        cO.showDetails();
    }
}