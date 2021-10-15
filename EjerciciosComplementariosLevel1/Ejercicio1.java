package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args){
        String usuario= "";
        System.out.println("Ingrese su nombre por favor \n");
        usuario = leer.nextLine();

        System.out.println("Hola "+usuario);

    }
}
