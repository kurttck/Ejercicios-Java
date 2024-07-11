import java.util.Scanner;

public class VerificacionDeContraseña {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la contraseña");
        String password = scanner.nextLine();

        if(password.equals("Contrase123")){
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Acceso denegado.");
        }


        scanner.close();
    }
}
