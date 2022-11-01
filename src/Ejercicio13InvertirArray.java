import java.util.Scanner;

public class Ejercicio13InvertirArray {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        int[] array1 = new int[10];

        System.out.println("Introduzca 10 números enteros");

        for (int i = 0; i < array1.length; i++){
            array1[i] = escaner.nextInt();
        }

        
        for (int i = 0; i < (array1.length)/2; i++){
            int aux = array1[i];
            array1[i] = array1[array1.length-1-i];
            array1[array1.length-1-i] = aux;
        }

        System.out.println("Array invertido");
        for (int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
    }
}
