import java.util.ArrayList;
import java.util.Scanner;

public class RegistroAlumnos {
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        ArrayList<String> alumns = new ArrayList<>();
        ArrayList<Double> notes = new ArrayList<>();
        int option=0;
        

        do {
        System.out.println("Menú de Opciones");
        System.out.println("1.Registrar alumno.");
        System.out.println("2.Mostrar todos los alumnos.");
        System.out.println("3.Mostrar promedio de notas");
        System.out.println("4.Buscar alumno por nombre.");
        System.out.println("5.Modificar nota por nombre.");
        System.out.println("6.Eliminar alumno por nombre.");
        System.out.println("7.Salir.");
        option = scan.nextInt();
        scan.nextLine();

        switch(option){
            case 1:{
                System.out.println("Ingrese nombre del alumno.");   
                String alumno = scan.nextLine();
                alumns.add(alumno);
                System.out.println("Ingrese la nota.");
                double nota =scan.nextDouble();
                notes.add(nota);
                break;
            }
            case 2:{
                System.out.println("Alumnos.");
                for(int i=0; i<alumns.size();i++){
                    System.out.println((i+1)+"."+alumns.get(i)+" - nota: "+ notes.get(i));
                };
                break;
            }
            case 3:{
                double acum=0;
                for(int i=0; i<alumns.size();i++){
                    acum+=notes.get(i);
                }
                System.out.println("El promedio es: "+acum/notes.size());
                break;
            }
            case 4:{
                System.out.println("Ingrese el nombre del alumno.");
                String name = scan.nextLine();
                boolean wanted = false;
                for(int i=0; i<alumns.size();i++){
                    if(alumns.get(i).equalsIgnoreCase(name)){
                        System.out.println("Alumno: "+alumns.get(i)+", Nota: "+ notes.get(i));
                        wanted=true;
                        break;
                    }
                    if(!wanted){
                        System.out.println("Alumno no encontrado");
                    }
                }
                break;
            }
            case 5:{
                System.out.println("Ingrese el nombre del alumno.");
                String name = scan.nextLine();
                boolean wanted=false;
                for(int i=0; i<alumns.size();i++){
                    if(alumns.get(i).equalsIgnoreCase(name)){
                        System.out.println("La nota actual es:"+notes.get(i)+", Ingrese la nueva nota.");
                        double newnote = scan.nextInt();
                        notes.set(i, newnote);
                        wanted=true;
                        break;
                    }
                    if(!wanted){
                        System.out.println("No fue encontrado el alumno");
                    }
                }
                break;
            }
            case 6:{
                System.out.println("Ingrese el nombre del alumno.");
                String name = scan.nextLine();
                boolean wanted=false;
                for(int i=0; i<alumns.size();i++){
                    if(alumns.get(i).equalsIgnoreCase(name)){
                    System.out.println("¿Eliminar al alumno: "+alumns.get(i)+"? y/n");
                    String yn = scan.nextLine();
                    if(yn.equals("y")){
                        alumns.remove(i);
                    }else{
                        break;
                    }    
                    wanted=true;
                    break;
                    }
                    if(!wanted){
                        System.out.println("Alumno no existe.");
                    }
                };
                break;
            }
            case 7:{
                System.out.println("Saliendo del Sistema.");
                break;
            }
            default:{
                System.out.println("Option invalida.");
                break;
            }

        }


        } while (option!=7);


        scan.close();
    }
}
