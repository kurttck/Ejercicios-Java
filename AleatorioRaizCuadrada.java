import java.util.Scanner;

public class AleatorioRaizCuadrada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;

        System.out.println("Ingrese un número entre el 1 y 30");
        int numeroLimite=scanner.nextInt();

        if (numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("The number must be between 1 and 30.");
            scanner.close();
            return;
          }

        double numRandom = Math.floor(Math.random()*(numeroLimite-1+1))+1;
        System.out.println("Número aleatorio entre 1 y " + numeroLimite + ": " + numRandom);

        System.out.println("El numero random es: "+numRandom+" y su raiz cuadrada es: "+Math.sqrt(numRandom));


        for (int i = 2; i <= Math.sqrt(numRandom); i++) {
            if (numRandom % i == 0) {
              isPrime = false;
              break;
            }
          }
      
          if (isPrime && numRandom> 1) {
            System.out.println(numRandom + " es un número primo.");
          } else {
            System.out.println(numRandom + " no es un número primo.");
          }
      
        
        scanner.close();
    }
}
