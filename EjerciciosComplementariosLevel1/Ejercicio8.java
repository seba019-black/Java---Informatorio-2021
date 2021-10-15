package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio8 {
    public static Scanner leer = new Scanner(System.in);

    public static  void main(String[] args){
        String nombreYApellido ;
        int edad ;
        String direccion;
        String ciudad;

        System.out.println("Ingrese su Nombre y Apellido ");
        nombreYApellido = leer.nextLine();
        System.out.println("Ingrese su Edad ");
        edad = leer.nextInt();
        System.out.println("Ingrese su Direccion ");
        direccion = leer.nextLine();
        System.out.println("Ingrese su Ciudad ");
        ciudad = leer.nextLine();

        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombreYApellido);
    }
 
}
