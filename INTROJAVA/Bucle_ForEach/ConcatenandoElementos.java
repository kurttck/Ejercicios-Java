package Bucle_ForEach;

public class ConcatenandoElementos {
    public static void main(String[] args){
        String[] days={"Lunes", "Martes", "Miercoles","Jueves", "Viernes","Sabado","Domingo"};
        String cadena=""; 
        for(String day: days){
            if(cadena==""){
                cadena=day;
            }else{
                cadena=cadena+" "+day;
            }
        }

        System.out.println(cadena);
    }
}
