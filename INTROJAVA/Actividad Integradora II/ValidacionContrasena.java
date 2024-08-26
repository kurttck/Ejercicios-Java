import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una contraseña para verificar");
        String password=scanner.nextLine();

        boolean mayusculas=password.matches(".*[A-Z].*");
        boolean minusculas=password.matches(".*[a-z].*");
        boolean numeros=password.matches(".*\\d*");
        boolean caracter=password.matches(".*[@$!%*?&].*");
        boolean longitud=password.length()>=8;

        if(mayusculas && minusculas && numeros && caracter && longitud){
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        }else{
            System.out.println("Contraseña no segura.");
            if(!mayusculas){
                System.out.println("Debe tener al menos una letra mayúscula.");
            }
            if(!minusculas){
                System.out.println("Debe tener al menos una letra minuscula.");
            }
            if(!numeros){
                System.out.println("Debe tener al menos un número.");
            }
            if(!caracter){
                System.out.println("Debe tener al menos un carácter especial.");
            }
            if (!longitud) {
                System.out.println("Tener como minumo 8 caracteres.");
            }
        }
        scanner.close();
    }
}
