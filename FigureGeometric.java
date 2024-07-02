import java.util.Scanner;

public class FigureGeometric {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 3");
        System.out.println("1. Circulo \n2. Cuadrado \n3. Triangulo \nHallaremos el area.");

        int number= scanner.nextInt();

        switch(number){
            case 1 ->{
                System.out.println("Ingrese el radio del circulo");
                double radio=scanner.nextDouble();
                System.out.println("El area del circulo es: "+(Math.PI*Math.pow(radio, 2)));
            }
            case 2 ->{
                System.out.println("Ingrese el lado del cuadrado");
                double lado=scanner.nextDouble();
                System.out.println("El área del cuadrado es: "+(lado*lado));
            }
            case 3 ->{
                System.out.println("Ingrese la base");
                double base=scanner.nextDouble();
                System.out.println("Ingrese la altura");
                double alt=scanner.nextDouble();
                System.out.println("El área del triangulo es: "+((base*alt)/2));
            }
            default ->{
                System.out.println("Escoge bien la opción");
            }
        }

        scanner.close();

    }
}
