import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado;

        System.out.println("------------------ \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n-------------------");
        System.out.println("Ingrese el número de la opción que usará: ");
        int operacion = scanner.nextInt();

        if(operacion==1){
            resultado=numero1+numero2;
        }else if(operacion==2){
            resultado=numero1-numero2;
        }else if(operacion==3){
            resultado=numero1*numero2;
        }else{
            resultado=numero1/numero2;
        }

        System.out.println("El resultado es: "+resultado);

        scanner.close();
    }
}
