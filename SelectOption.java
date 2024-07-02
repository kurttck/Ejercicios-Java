import java.util.Scanner;

public class SelectOption {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Opción 1: 'Guardar'\nOpción 2: 'Cargar'\nOpción 3: 'Salir'");
        System.out.println("Ingrese el número de la opción que desee.");

        int number= scanner.nextInt();

        switch(number){
            case 1: System.out.println("Guardar");break;
            case 2: System.out.println("Cargar");break;
            case 3: System.out.println("Salir");break;
            default: System.out.println("No exite opcion");
        }

        scanner.close();

    }
}
