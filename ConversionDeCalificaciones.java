import java.util.Scanner;

public class ConversionDeCalificaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Calificación numerica del 1 al 5");
        int number=scanner.nextInt();

        switch(number){
            case 1: System.out.println("Muy deficiente");break;
            case 2: System.out.println("Deficiente");break;
            case 3: System.out.println("Suficiente");break;
            case 4: System.out.println("Notable");break;
            default: System.out.println("Sobresaliente");break;
        }

        scanner.close();
    }
}
    