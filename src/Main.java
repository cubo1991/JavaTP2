import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modularizamos el código en diferentes métodos
       /* ejercicio1(sc);
        ejercicio2(sc);

        ejercicio3(sc);

        */
        //ejercicio4(sc);  // Método para el Ejercicio 4
        // ejercicio5(sc);  // Método para el Ejercicio 5
        // ejercicio6(sc);  // Método para el Ejercicio 6
        // ejercicio7(sc);  // Método para el Ejercicio 7
        // ejercicio8(sc);  // Método para el Ejercicio 8
        // ejercicio9(sc);  // Método para el Ejercicio 9
        // ejercicio10(sc);  // Método para el Ejercicio 10
        // ejercicio11(sc);  // Método para el Ejercicio 11
        // ejercicio12(sc);  // Método para el Ejercicio 12
        // ejercicio13(sc);  // Método para el Ejercicio 13
        // ejercicio14(sc);  // Método para el Ejercicio 14
        // ejercicio15(sc);  // Método para el Ejercicio 15
        // ejercicio16(sc);  // Método para el Ejercicio 16
        // ejercicio17(sc);  // Método para el Ejercicio 17
        // ejercicio18(sc);  // Método para el Ejercicio 18
         ejercicio19();  // Método para el Ejercicio 19
        // ejercicio20(sc);  // Método para el Ejercicio 20
        // ejercicio21(sc);  // Método para el Ejercicio 21
        // ejercicio22(sc);  // Método para el Ejercicio 22
        // ejercicio23(sc);  // Método para el Ejercicio 23
    }

    // Método para el Ejercicio 1
    public static void ejercicio1(Scanner sc) {
        short valorShort;
        int valorInt;
        long valorLong;
        String valorString;
        float valorFloat;

        System.out.println("Ingrese un número:");
        double valorDecimal = sc.nextDouble();

        // Conversiones
        valorInt = (int) valorDecimal;
        valorShort = (short) valorDecimal;
        valorLong = (long) valorDecimal;
        valorString = Double.toString(valorDecimal);
        valorFloat = (float) valorDecimal;

        // Salidas
        System.out.println("El valor en Int es " + valorInt);
        System.out.println("El valor en Short es " + valorShort);
        System.out.println("El valor en Long es " + valorLong);
        System.out.println("El valor en String es " + valorString);
        System.out.println("El valor en Float es " + valorFloat);
    }

    // Método para el Ejercicio 2
    public static void ejercicio2(Scanner sc) {
        System.out.println("Ingrese un número pequeño (byte):");
        try {
            byte numeroPequeno = sc.nextByte();
            System.out.println("Número ingresado: " + numeroPequeno);
        } catch (Exception e) {
            System.out.println("Error: Valor fuera de rango para un byte.");
        }
    }

    // Método para el Ejercicio 3
    public static void ejercicio3(Scanner sc) {
        int numeroTresCifras;
        int primeraCifra;
        int segundaCifra;
        int terceraCifra;
        int total;

        System.out.println("Ingrese un número de tres cifras");
        numeroTresCifras = sc.nextInt();
        primeraCifra = numeroTresCifras % 10;
        segundaCifra = numeroTresCifras % 100;
        segundaCifra = segundaCifra / 10;
        terceraCifra = numeroTresCifras / 100;
        total = primeraCifra + segundaCifra + terceraCifra;
        System.out.println(total);
    }

    // Método para el Ejercicio 4
    public static void ejercicio4(Scanner sc) {
        double dinero;
        List<Integer> denominaciones = new ArrayList<>();
        List<Double> monedas = new ArrayList<>();

        // Añadimos elementos a las listas
        denominaciones.add(200);
        denominaciones.add(100);
        denominaciones.add(50);
        denominaciones.add(20);
        denominaciones.add(10);
        denominaciones.add(5);
        denominaciones.add(2);
        denominaciones.add(1);
        monedas.add(0.50);
        monedas.add(0.25);
        monedas.add(0.10);
        monedas.add(0.05);

        int iterador = 0;

        System.out.println("Ingrese el dinero a calcular separando a los centavos con coma (Ej: 50,78)");
        dinero = sc.nextDouble();

        // Redondear el dinero a dos decimales
        dinero = redondearADosDecimales(dinero);

        // Calcular los billetes
        while (dinero > 0 && iterador < denominaciones.size()) {
            double resultado = dinero / denominaciones.get(iterador);
            if (resultado > 0) {
                int cantidad = (int) resultado;
                System.out.println("Necesita " + cantidad + " billetes de " + denominaciones.get(iterador));
                dinero = redondearADosDecimales(dinero % denominaciones.get(iterador));  // Actualiza el valor de dinero
            }
            iterador++;
        }

        iterador = 0;

        // Calcular las monedas
        while (dinero > 0 && iterador < monedas.size()) {
            double resultado = dinero / monedas.get(iterador);
            if (resultado > 0) {
                int cantidad = (int) resultado;
                System.out.println("Necesita " + cantidad + " monedas de " + monedas.get(iterador));
                dinero = redondearADosDecimales(dinero % monedas.get(iterador));  // Actualiza el valor de dinero
            }
            iterador++;
        }

        System.out.println("Dinero restante: " + dinero);
    }

    // Método para redondear a dos decimales
    public static double redondearADosDecimales(double numero) {
        BigDecimal bd = new BigDecimal(numero);
        bd = bd.setScale(2, RoundingMode.DOWN);  // RoundingMode.DOWN trunca el número
        return bd.doubleValue();
    }

    // Método para el Ejercicio 5
    public static void ejercicio5(Scanner sc) {
        // Lógica para el ejercicio 5
    }

    // Método para el Ejercicio 6
    public static void ejercicio6(Scanner sc) {
        // Lógica para el ejercicio 6
    }

    // Método para el Ejercicio 7
    public static void ejercicio7(Scanner sc) {
        // Lógica para el ejercicio 7
    }

    // Método para el Ejercicio 8
    public static void ejercicio8(Scanner sc) {
        // Lógica para el ejercicio 8
    }

    // Método para el Ejercicio 9
    public static void ejercicio9(Scanner sc) {
        // Lógica para el ejercicio 9
    }

    // Método para el Ejercicio 10
    public static void ejercicio10(Scanner sc) {
        // Lógica para el ejercicio 10
    }

    // Método para el Ejercicio 11
    public static void ejercicio11(Scanner sc) {
        // Lógica para el ejercicio 11
    }

    // Método para el Ejercicio 12
    public static void ejercicio12(Scanner sc) {
        // Lógica para el ejercicio 12
    }

    // Método para el Ejercicio 13
    public static void ejercicio13(Scanner sc) {
        // Lógica para el ejercicio 13
    }

    // Método para el Ejercicio 14
    public static void ejercicio14(Scanner sc) {
        // Lógica para el ejercicio 14
    }

    // Método para el Ejercicio 15
    public static void ejercicio15(Scanner sc) {
        // Lógica para el ejercicio 15
    }

    // Método para el Ejercicio 16
    public static void ejercicio16(Scanner sc) {
        // Lógica para el ejercicio 16
    }

    // Método para el Ejercicio 17
    public static void ejercicio17(Scanner sc) {
        // Lógica para el ejercicio 17
    }

    // Método para el Ejercicio 18
    public static void ejercicio18(Scanner sc) {
        // Lógica para el ejercicio 18
    }

    // Método para el Ejercicio 19
    public static void ejercicio19()  {
        // Lógica para el ejercicio 19
        Calculo.realizarCalculos();




    }

    // Método para el Ejercicio 20
    public static void ejercicio20(Scanner sc) {
        // Lógica para el ejercicio 20
    }

    // Método para el Ejercicio 21
    public static void ejercicio21(Scanner sc) {
        // Lógica para el ejercicio 21a
    }

    // Método para el Ejercicio 22
    public static void ejercicio22(Scanner sc) {
        // Lógica para el ejercicio 22
    }

    // Método para el Ejercicio 23
    public static void ejercicio23(Scanner sc) {
        // Lógica para el ejercicio 23
    }
}
