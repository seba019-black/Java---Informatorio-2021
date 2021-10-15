package EjerciciosComplementariosLevel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args){
        int num;
        
        System.out.println("Ingrese un numero para imprimir su secuencia \n");
        num = leer.nextInt();

        for(int i = 1; i<= num;i++){
            List<Integer> lista = new ArrayList<Integer>();
            for(int j=1; j<=i;j++){
                lista.add(j);
            }
            System.out.println(lista);
        }

       
            
        

        




    }
}
