package Bucle_ForEach;
//import java.util.Arrays;
import java.util.Scanner;

public class ContarOcurrencias {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String frase = "quiero comer papita rellena";
        char[] caracteres= new char[50]; //Creamos el array con 50 elementos 
        int contador=0;                  // Creamos contador para contabilizar cuantas veces aparece un caracter

        for(int i=0;i<frase.length();i++){  //asignamos cada letra a un espacio del array
            char caracter= frase.charAt(i);
            caracteres[i]=caracter;
        }

        //System.out.println(Arrays.toString(caracteres));

        System.out.println("Ingresa un caracter para averiguar si esta en la frase");
        char userCaracter = scanner.next().charAt(0); //guardamos el caracter que el usuario ingresara en tipo de dato Caracter(char)

        for(char caracter: caracteres){  //hacemos que pase por todos los elementos y 
            if(caracter==userCaracter){  //comparamos si se encuentra el caracter en la frase o no, luego si esta sumamos uno al contador   
                contador++;
            }
        }

        if(contador==0){    //Por ultimo condicionamos la salida dependiendo si se encontro similitud o no.
            System.out.println("El caracter '"+userCaracter+"' no aparece en la frase.");
        }else{
            System.out.println("El caracter '"+userCaracter+"' aparece "+contador+" veces en la frase.");
        }

        scanner.close();
    }
}
