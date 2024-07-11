package Bucle_For;

public class EncontrandoValorMinimo {
    public static void main(String[] args){
        int[] enteros={12,21,13,4};

        int minimo = enteros[0];

        for(int i=0;i<enteros.length;i++){
            if(enteros[i]<minimo){
                minimo=enteros[i];
            }
        }

        System.out.println("El valor minimo es: ");
        System.out.println(minimo);
    }
}
