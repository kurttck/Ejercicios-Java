package Actividad_Integradora_IV;
import java.util.Scanner;

class CalculoDelFactorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero para sacar el factorial.");
        int number = scan.nextInt();
        int acum=1;
        int cont=1;
        do {
            acum *= cont;
            cont++;
        } while (number>=cont);

        System.out.println("El factorial es: "+acum);
        scan.close();
    }
}
