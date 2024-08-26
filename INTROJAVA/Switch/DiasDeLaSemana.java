package Switch;
import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero del 1 al 7 para saber el dia de la semana.");
        int number=scanner.nextInt();
        
            switch(number){
                case 1: System.out.println("Lunes");break;
                case 2: System.out.println("Martes");break;
                case 3: System.out.println("Miercoles");break;
                case 4: System.out.println("Jueves");break;
                case 5: System.out.println("Viernes");break;
                case 6: System.out.println("Sábado"); break;
                case 7: System.out.println("Domingo");break;
                default: System.out.println("El número no esta orientado a ningun dia de la semana porque son del 1 al 7"); break;
            }

        scanner.close();
    }
}
