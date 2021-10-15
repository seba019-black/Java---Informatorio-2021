package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static Scanner leer = new Scanner(System.in);

    public static  void main(String[] args){
        int num1 ;
        int num2 ;
        int potencia = 1;

        System.out.println("Ingrese un numero: \n");
        num1 = leer.nextInt();
        System.out.println("Ingrese el exponente: \n");
        num2 = leer.nextInt();

        for (int i = 1;i<=num2; i++){
            potencia = potencia * num1;
           

        }

        System.out.println(potencia);
    }
}
