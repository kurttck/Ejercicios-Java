package Bucle_For;


import java.util.Arrays;

public class SumaAcumulada {
    public static void main(String[] args){
        int[] entero={1,22,32,14,5};
        int suma=0;

        for(int i=0;i<entero.length;i++){
            suma+=entero[i];
            entero[i]=suma;
        }

        System.out.println(Arrays.toString(entero));
    }
}
