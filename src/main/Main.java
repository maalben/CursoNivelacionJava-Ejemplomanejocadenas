package main;
import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = teclado.nextLine();

        System.out.println("Primera letra " + nombre.charAt(0));
        System.out.println("Nombre en Mayúscula " + nombre.toUpperCase());
        System.out.println("Nombre en Minúscula " + nombre.toLowerCase());
        System.out.println("Cantidad de carácteres " + nombre.length());
        System.out.println("Comparar si es igual a mario: " + nombre.equals("mario"));
        System.out.println("Comparar si contiene la letra a: " + nombre.contains("a"));

    }
}
