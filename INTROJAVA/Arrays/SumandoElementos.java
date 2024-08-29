package Arrays;

public class SumandoElementos {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 5 };
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        System.out.println(suma);
    }
}
