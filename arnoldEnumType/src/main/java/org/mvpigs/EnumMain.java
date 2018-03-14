package org.mvpigs;

public class EnumMain {
    public void main(String args[]){
        double peso = 70;

    for (Planeta planeta: Planeta.values()){
        System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
    }

    System.out.println("\nYour weight only on the terrestrial planets: ");
    for(Planeta planeta: Planeta.getPlanetasTerrestres()){
        System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
    }

    System.out.println("\nYour weight only on the gas giant planets: ");
    for(Planeta planeta: Planeta.getGigantesGaseosos()){
        System.out.printf("Your weight on %s is %f N%n", planeta.name(), planeta.pesoSuperficie(peso));
    }
    }

}
