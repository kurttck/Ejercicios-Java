package Bucle_ForEach;

import java.util.Arrays;

public class ContandoElementosPares {
    public static void main(String[] args){
        int[] numbers= new int[10];
        int contador=0;
        int contadorpares=0;
        
        for(int number : numbers){
            number=(int)(Math.random()*100); 
            numbers[contador]=number;
            contador++;
        }
        System.out.println(Arrays.toString(numbers));

        for(int numberpar:numbers){
            if(numberpar%2==0){
                contadorpares++;
            }
        }

        System.out.println("Hay "+contadorpares+" números pares.");
    }
}
