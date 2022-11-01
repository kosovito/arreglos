import java.util.Scanner;

public class Ejercicio14MayorArray {
    public static void main(String[] args) {

        Scanner escaner = new Scanner(System.in);

        int[] array1 = new int[7];

        System.out.println("Introduzca 7 números enteros");

        for (int i = 0; i < array1.length; i++){
            array1[i] = escaner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < (array1.length); i++){
            max = (array1[i] > max) ? array1[i] : max;
        }

        System.out.println("El mayor es: " + max);

    }
}
