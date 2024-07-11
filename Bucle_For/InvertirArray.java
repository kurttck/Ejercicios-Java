package Bucle_For;

import java.util.Arrays;

public class InvertirArray {
    public static void main(String[] args) {
        int[] enteros={1,2,3,54};

        int[] aux = new int[enteros.length];
        int contador=enteros.length-1;

        for( int i=0;i<aux.length;i++){
            
            aux[i]=enteros[contador];
            contador--;
        }

        System.out.println(Arrays.toString(aux));
    }
}
