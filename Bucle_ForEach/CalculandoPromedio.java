package Bucle_ForEach;

public class CalculandoPromedio {
    public static void main(String[] args){
        float[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        float acum=0;
        for(float number: numbers){
            acum+=number;
        }

        float prom = acum/numbers.length;
        
        System.out.println("La suma es: "+acum);
        System.out.println("El promedio es: "+prom);
    }
}
