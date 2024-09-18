

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static <T> void print(T content) {
        System.out.println(content);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Modularizamos el código en diferentes métodos

        ejercicio1(sc);
        ejercicio2(sc);
        ejercicio3(sc);
        ejercicio4(sc);
        ejercicio5(sc);
        ejercicio6(sc);
        ejercicio7();
        ejercicio8(sc);
        ejercicio9(sc);
        ejercicio10();
        ejercicio11();
        ejercicio12();
        ejercicio13();
        ejercicio14(sc);
        ejercicio15(sc);
        ejercicio16(sc);
        ejercicio17(sc);
        ejercicio19();
        ejercicio20(sc);
        print(ejercicio21(5));
        print(ejercicio22("789"));
        print(ejercicio23("oirotircse ed arodatupmoc"));
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
    //Si se asigna un valor fuera de rango a una variable, puede ocurrir un desbordamiento,
    //lo que provoca que el valor se ajuste automáticamente a un número incorrecto dentro del rango permitido.
    //Esto depende del tipo de dato; por ejemplo, en un int de Java, si se supera el valor máximo, el valor "rebota"
    //y comienza desde el mínimo permitido. Para evitar este problema, se puede usar tipos de datos más grandes
    //o implementar validaciones que limiten los valores antes de asignarlos.
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
        //solicitamos el ingreso de un número y lo convertimos a un String mediante String.valueOf
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduci un numero");
        int numero = scaner.nextInt();
        String cadena = String.valueOf(numero);
        System.out.println("el nuumero como cadena es: " + cadena);

    }

    // Método para el Ejercicio 6
    public static void ejercicio6(Scanner sc) {
        // Lógica para el ejercicio 6
        // calculamos el tamaño de la cadena, mediante la funcion length()
        String texto = "La lluvia en Mendoza es escasa";
        int longitud = texto.length();
        System.out.println("el tamaño de la cadena es : " + longitud + " caracteres");

    }

    // Método para el Ejercicio 7
    public static void ejercicio7() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduce una cadena ");
        String cadena = scaner.nextLine();
        int tamaños = cadena.length();
        int totalDEvocales = contadoresDeVocales3(cadena);
        System.out.println("El tamaño de la cadena es:  " + tamaños + "  caracteres.");
        System.out.println("La cantidad de vocales en la cadena es: " + totalDEvocales);
    }

    public static int contadoresDeVocales3(String cadena) {
        int contadOrDeVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracteres = cadena.charAt(i);
            Character.toLowerCase(caracteres);
            switch (caracteres) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contadOrDeVocales++;
                    break;


            }

        }
        return contadOrDeVocales;
    }

    // Método para el Ejercicio 8
    public static void ejercicio8(Scanner sc) {
        // Lógica para el ejercicio 8
        //usamos la funcion replace() para remplazar todas las letras  A por E
        String textos3 = "La lluvia en Mendoza es escasa";
        String textoModificado = textos3.replace('a', 'e');
        System.out.println("texto original :  " + textos3);
        System.out.println(" texto modificado :  " + textoModificado);

    }

    // Método para el Ejercicio 9
    public static void ejercicio9(Scanner sc) {
        // Lógica para el ejercicio 9
        // usamos la funcion charAT() para transforma cada carácter a su código ASCII
        String text0sacodigo = "La lluvia en Mendoza es escasa";
        for (int x = 0; x < text0sacodigo.length(); x++) {
            char letras = text0sacodigo.charAt(x);
            int codigoAscii = (int) letras;
            System.out.print(codigoAscii + " ");
        }
        System.out.println();

    }

    //Método para el Ejercicio 10
    public static void ejercicio10(){
        Scanner leer = new Scanner(System.in);

        //Mostrar un mensaje por consola
        System.out.println("Ingrese una frase u oración:");
        String cadena = leer.nextLine();

        //mostrar el dato ingresado
        System.out.println("La frase ingresada es:"+cadena);

        //llamar funcion
        ConvertirMayusMinus.FraseConvertida(cadena,leer);
    }
    public class ConvertirMayusMinus{
        static void FraseConvertida(String cadena,Scanner scanner){
            int num = 0;
            do {
                System.out.println("Desea convertir la frase en:");
                System.out.println("-Mayusculas(1)");
                System.out.println("-Minusculas(2)");
                //leer dato
                num= scanner.nextInt();

                //bucle if
                if (num!=1 && num!=2){
                    System.out.println("Numero no valido, intentelo de nuevo");
                }
            }while (num!=1 && num!=2);

            //mostrar resultados
            if (num==1){
                System.out.println("Frase en mayusculas:"+cadena.toUpperCase());
            } else if (num==2) {
                System.out.println("Frase en minusculas:"+cadena.toLowerCase());

            }


        }
    }


    // Método para el Ejercicio 11
    public static void ejercicio11() {

        Scanner scanner = new Scanner(System.in);
        //Pedir al usuario que ingrese dos datos
        System.out.println("Ingrese la primera palabra:");
        String Palabra1 = scanner.nextLine();

        System.out.println("Ingrese la segunda palabra:");
        String Palabra2 = scanner.nextLine();

        //compareTo: Compara cadenas lexicográficamente (case-sensitive).
    /*devuelve:
          - Un número negativo si la cadena actual es lexicográficamente (codigo ascii) menor que la cadena pasada.
          - Cero si son iguales.
          - Un número positivo si la cadena actual es mayor.*/
        int Valorcompare = Palabra1.compareTo(Palabra2);

        //metodo compareTo
        if (Valorcompare < 0) {
            System.out.println("La palabra: <"+Palabra1+"> 'es menor que la segunda palabra: <"+Palabra2+"> , usando el metodo compareTo");

        } else if (Valorcompare > 0 ){
            System.out.println("La palabra: <"+Palabra1+"> es mayor que la segunda palabra: <"+Palabra2+"> , usando el metodo compareTo");
        } else {

            System.out.println("Ambas palabras son iguales, usando el metodo compareTo");
        }


        //CompareToIgnore Case: Compara cadenas lexicográficamente,(no aplica case-sensitive)
        int ValorCompareTC = Palabra1.compareToIgnoreCase(Palabra2);

        //metodo CompareToIgnoreCase
        if (ValorCompareTC == 0) {
            System.out.println("Ambas palabras son iguales (ignorando Mayusculas e minusculas), usando el metodo CompareToIgnoreCase");

        } else if (ValorCompareTC < 0) {
            System.out.println("La palabra: <"+Palabra1+"> es menor que la segunda palabra: <"+Palabra2+"> , usando el metodo CompareToIgnoreCase");

        }else {
            System.out.println("La palabra: <"+Palabra1+"> es mayor que la segunda palabra: <"+Palabra2+"> , usando el metodo CompareToIgnoreCase");
        }


        //metodo equals: Compara si dos cadenas son exactamente iguales (case-sensitive).
        if (Palabra1.equals(Palabra2)) {
            System.out.println("Ambas palabras son iguales, usando el metodo equals");
        }else {
            System.out.println("Las palabras ingresadas no son iguales, usando el metodo equals");
        }


    }

    // Método para el Ejercicio 12
    public static void ejercicio12() {

        Scanner scanner = new Scanner(System.in);

        //definimos variable
        String Cadena;

        while (true){

            //mostramos mensaje por consola
            System.out.print("Ingrese una frase (minimo 5 caracteres):");
            //escanear el dato ingresado por el usuario
            Cadena = scanner.nextLine();


            if (Cadena.length() < 5){ // para evitar un error por insuficientes caracteres

                System.out.println("Caracteres insufiecientes, intente de nuevo");
            }else {
                break;
            }
        }


        //metodo substring
        String SubCadena = Cadena.substring(3,5);

        System.out.println("La cuarta y quinta letra de la frase son: "+SubCadena);


    }

    // Método para el Ejercicio 13
    public static void ejercicio13() {
        Scanner leer = new Scanner(System.in);


        // pedir datos al usuario
        System.out.print("Ingrese la primera frase: ");
        String cadena1 = leer.nextLine();

        System.out.print("Ingrese la segunda frase: ");
        String cadena2 = leer.nextLine();

        // Verificar si la segunda cadena está dentro de la primera usando contains
        //contais: se utiliza para verificar si una cadena contiene una subcadena específica

        if (cadena1.toLowerCase().contains(cadena2.toLowerCase())) {
            //utilizamos to.lowercase porque contains en case-sensivite
            System.out.println("La segunda cadena se encuentra dentro de la primera.");
        } else {
            System.out.println("La segunda cadena NO se encuentra dentro de la primera.");
        }

    }

    // Método para el Ejercicio 14
    public static void ejercicio14(Scanner sc) {

        class MainInt {

            public static void main14(String[] args) {
                // Declaración de una variable int
                int numero = 10;

                // Operaciones aritméticas
                numero = numero + 5;

                // Comparación con otro int
                int otroNumero = 15;
                if (numero == otroNumero) {
                    System.out.println("Los números son iguales.");
                } else {
                    System.out.println("Los números son diferentes.");
                }

                // Operaciones simples
                int suma = numero + otroNumero;
                System.out.println("La suma de los números es: " + suma);

            }
        }

        class MainInteger {

            public static void main142(String[] args) {
                // Declaración de un objeto Integer
                Integer numero = 10;

                // Operaciones aritméticas
                numero = numero + 5;  // Autoboxing y Unboxing automáticos

                // Comparación con otro Integer
                Integer otroNumero = 15;
                if (numero.equals(otroNumero)) {
                    System.out.println("Los números son iguales.");
                } else {
                    System.out.println("Los números son diferentes.");
                }

                // Operaciones simples
                Integer suma = numero + otroNumero;
                System.out.println("La suma de los números es: " + suma);
            }
        }
    }


    // Método para el Ejercicio 15
    public static void ejercicio15(Scanner sc) {

        class Main15 {
            public static void main15(String[] args) {
                Integer numero = null;

                if (numero == null) {
                    System.out.println("El valor de numero es null.");
                } else {
                    System.out.println("El valor de numero es: " + numero);
                }
            }
        }

    }

    // Método para el Ejercicio 16
    public static void ejercicio16(Scanner sc) {

        class Main16 {
            public static void main16(String[] args) {
                // Crear una variable de tipo Double
                Double valorDouble = 7.7;

                // Convertir Double a tipo primitivo double
                double valorPrimitivo = valorDouble;

                // Resultado
                System.out.println("El valor primitivo es: " + valorPrimitivo);
            }
        }

    }

    // Métodos para el Ejercicio 17 y 18
    // Clase FuncionesPrograma
    class FuncionesPrograma {

        // Método que recibe la fecha y la retorna como cadena
        public static String getFechaString(Date fecha) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return sdf.format(fecha);
        }

        // Método que recibe día, mes y año, y retorna un objeto Date
        public static Date getFechaDate(int dia, int mes, int anho) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(anho, mes - 1, dia);
            return calendar.getTime();
        }
    }


    public static void ejercicio17(Scanner sc) {
        // Ejecutar el main de Principal
        Principal.main(new String[]{});
    }

    class Principal {

        public static void main(String[] args) {

            // Agrego la fecha que yo quiera
            Date fechaEspecifica = FuncionesPrograma.getFechaDate(05, 01, 2024);

            // Convierto a cadena
            String fechaComoCadena = FuncionesPrograma.getFechaString(fechaEspecifica);

            // Imprimir el resultado
            System.out.println("La fecha específica es: " + fechaComoCadena);
        }
    }

    // Método para el Ejercicio 19
    public static void ejercicio19() {
        // Lógica para el ejercicio 19
        Calculo.realizarCalculos();


    }


    // Método para el Ejercicio 20
    public static void ejercicio20(Scanner sc) {
        // Lógica para el ejercicio 20
        OperacionesFraccion.obtenerOperacionesFraccion();

    }


    // Método para el Ejercicio 21
    public static int ejercicio21(int x) {
        if (x == 0) {
            return 0;
        } else {
            return x + ejercicio21(x - 1);
        }
    }

    // Método para el Ejercicio 22
    public static int ejercicio22(String x) {
        if (x == "") return 0;
        else {
            return Character.getNumericValue(x.charAt(x.length() - 1)) + ejercicio22(x.substring(0, x.length() - 1));
        }
    }

    // Método para el Ejercicio 23
    public static String ejercicio23(String s) {
        if (s == "") return "";
        return s.charAt(s.length() - 1) + ejercicio23(s.substring(0, s.length() - 1));

    }


}




