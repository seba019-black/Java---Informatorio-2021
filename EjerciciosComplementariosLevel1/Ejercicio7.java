package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    public static Scanner leer = new Scanner(System.in);

    public static  void main(String[] args){
        String texto ="";
        System.out.println("Ingrese una palabra \n");
        texto = leer.nextLine();
        String textoUpper="";
        for( int i = 0; i< texto.length();i++){
            char letra = Mayuscula(texto.charAt(i));
            textoUpper += letra;
        }
        System.out.println(textoUpper);
        leer.close();
    }
    public static char Mayuscula(char texto){
        if (texto >= 'a'|| texto <= 'z'){
            texto = (char) (texto - ('a'-'A'));
        }
        return texto;
    }
  
}
