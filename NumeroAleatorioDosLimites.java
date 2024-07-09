import java.util.Scanner;

public class NumeroAleatorioDosLimites {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Limite inferior");
        int bot=scanner.nextInt();

        System.out.println("Limite Superior");
        int top=scanner.nextInt();

        System.out.println("El número random es: "+(Math.floor(Math.random()*(top-bot+1))+bot));

        scanner.close();
    }    
}
