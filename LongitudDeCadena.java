import java.util.Scanner;

public class LongitudDeCadena {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingrese una Cadena de Texto");
        String cadena=scanner.nextLine();

        System.out.println("La longitud es: "+cadena.length());
        
        scanner.close();
    }
}
