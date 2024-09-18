import java.util.Scanner;

public class OperacionesFraccion {

    public static void obtenerOperacionesFraccion()    {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos los valores de las fracciones
        System.out.println("Ingrese el numerador de la primera fracción: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la primera fracción: ");
        int den1 = scanner.nextInt();
        Fraccion fraccion1 = new Fraccion(num1, den1);

        System.out.println("Ingrese el numerador de la segunda fracción: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el denominador de la segunda fracción: ");
        int den2 = scanner.nextInt();
        Fraccion fraccion2 = new Fraccion(num2, den2);
        // Sumar fracciones
        Fraccion suma = fraccion1.sumarFracciones(fraccion2);
        System.out.println("Suma de las fracciones: " + suma);

        // Restar fracciones
        Fraccion resta = fraccion1.restarFracciones(fraccion2);
        System.out.println("Resta de las fracciones: " + resta);

        // Multiplicar fracciones
        Fraccion multiplicacion = fraccion1.multiplicarFracciones(fraccion2);
        System.out.println("Multiplicación de las fracciones: " + multiplicacion);

        // Dividir fracciones
        Fraccion division = fraccion1.dividirFracciones(fraccion2);
        System.out.println("División de las fracciones: " + division);

        scanner.close();

    }
}