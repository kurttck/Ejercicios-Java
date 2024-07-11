package Switch;
import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Numero del 1 al 7 que represente a un dia de la semana.");
        int number=scanner.nextInt();

       /*  switch(number){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("Es dia Habil.");break;
            case 6:
            case 7: System.out.println("Dia no hábil.");break;
        } */

        switch(number){
            case 1, 2, 3 ,4 ,5 -> {
                System.out.println("Es dia Habil.");
            }
            case 6, 7 ->{
                System.out.println("Dia no hábil.");
            }
        }


        scanner.close();
    }
}
