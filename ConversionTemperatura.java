import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double conversion;

        // try para capturar los errores
        try {
            // ingresamos datos
            System.out.println("Ingrese una temperatura");
            int temp = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese una unidad de medida: Celsius (C) o Fahrenheit (F)");
            String unidad = scanner.nextLine();

            // ingresara solo si selecciono C o F
            if (unidad.equals("C") || unidad.equals("F")) {
                switch (unidad) {
                    case "C" -> {
                        conversion = (temp - 32) * 5 / 9;
                    }
                    default -> {
                        conversion = (temp * 9 / 5) + 32;
                    }
                }
                System.out.println(temp + " grados " + (unidad.equals("C") ? "Farenheit" : "Celsius") + " equivalen a "
                        + conversion + " grados " + (unidad.equals("F") ? "Farenheit" : "Celsius"));
            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no valida. Ingrese un temperatura númerica");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
