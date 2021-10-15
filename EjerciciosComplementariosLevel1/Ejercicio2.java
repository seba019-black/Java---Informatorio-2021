package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner leer = new Scanner(System.in);

    public static  void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        double suma, resta, multiplicacion, division, resto;

        System.out.println("Ingrese un numero: \n");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero: \n");
        num2 = leer.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;

        System.out.println(num1+" + "+num2+" = "+suma);
        System.out.println(num1+" - "+num2+" = "+resta);
        System.out.println(num1+" * "+num2+" = "+multiplicacion);
        System.out.println(num1+" / "+num2+" = "+division);
        System.out.println(num1+" % "+num2+" = "+resto);




    }
}
