package com.company;

public class Main {

    public static void main(String[] args) {

        //if statement
        System.out.println("If statement");

        int numerolf = -5;
        if(numerolf > 0)
            System.out.println("Numero positivo");
        else if(numerolf == 0)
            System.out.println("El numero es cero");
        else
            System.out.println("Numero negativo");

        //while loop
        System.out.println("While loop");

        int numeroWhile = 0;
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        //do-while loop
        System.out.println("Do-While loop");

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        //for loop
        System.out.println("For loop");

        for(int numeroFor=0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        // Switch case
        System.out.println("Switch case");

        String estacion = "Verano";
        switch(estacion){
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            default:
                System.out.println("No es una estacion");
                
        }

    }
}
