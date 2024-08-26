package Bucle_For;

public class ElementosOrdenInverso {
    public static void main(String[] args){
        int[] enteros={1,2,3,4,8,61,87};

        for( int i=enteros.length-1;i>=0;i--){
            System.out.println(enteros[i]);
        }
    }
}
