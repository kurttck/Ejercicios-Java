package Wrappers;
import java.util.Scanner;

public class VerificandoCadenaSoloLetras {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un texto.");

        String text = scan.nextLine();
        Boolean state= false;
        for(int i=0;i<text.length();i++){
            if(!Character.isLetter(text.charAt(i))){
                state=true;
                break;
            }
        }

        if(state){
        System.out.println("Texto no contiene solo letras.");
        }else{ 
        System.out.println("Texto contiene solo letras");
        }

        scan.close();
    }
}
