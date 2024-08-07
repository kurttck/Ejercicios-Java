
import java.util.Scanner;

public class TablaDeMultiplicar2 {
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args){
        int[] numbers= new int[3];

        int number1 = getNumber();
        numbers[0]=number1;
        int number2 = getNumber();
        numbers[1]=number2;
        int number3 = getNumber();
        numbers[2]=number3;

        imprimirTablaMultiplicar(numbers);
    }

    private static int getNumber(){
        System.out.println("Ingrese un número");
        return scan.nextInt();
    }

    private static void imprimirTablaMultiplicar(int[] numbers){
        for(int number : numbers){
            System.out.println("Tabla de Multiplicar del número "+number);
            for(int i=1;i<=10; i++){
                System.out.println(number+" x "+i+" = "+(number*i));
            }
            System.out.println("\n");
        }
    }
}

