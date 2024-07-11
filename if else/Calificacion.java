import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entre 0 y 100");
        int number=scanner.nextInt();
        String puntuacion="";
        if (number>=0 && number<=100) {
            if(number>=90){
                puntuacion="A";
            }else if(number>=80 && number<=89){
                puntuacion="B";
            }else if(number>=70 && number<=79){
                puntuacion="C";
            }else if(number>=60 && number<=69){
                puntuacion="D";
            }else{
                puntuacion="F";
            }   
            System.out.println("La puntuación es: "+puntuacion);
        }else{
            System.out.println("El número ingresado está fuera del rango válido");
        }
        
        scanner.close();
    }
}
