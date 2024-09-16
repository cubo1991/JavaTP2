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
        //ejercicio10(sc);  // Método para el Ejercicio 10
        // ejercicio11(sc);  // Método para el Ejercicio 11
        //ejercicio12(sc);  // Método para el Ejercicio 12
         ejercicio13(sc);  // Método para el Ejercicio 13
        // ejercicio14(sc);  // Método para el Ejercicio 14
        // ejercicio15(sc);  // Método para el Ejercicio 15
        // ejercicio16(sc);  // Método para el Ejercicio 16
        // ejercicio17(sc);  // Método para el Ejercicio 17
        // ejercicio18(sc);  // Método para el Ejercicio 18
         //ejercicio19();  // Método para el Ejercicio 19
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
    public static void ejercicio7(Scanner sc) {
        // Lógica para el ejercicio 7
        // creamos una funcion que cuente las vocales por cada iteracion
        public static int contadoresDeVocales3 (String cadena){
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
// llamamos a la funcion, y calculamos la cantidad de vocales
        Scanner scaner = new Scanner(System.in);
        System.out.println("introduce una cadena ");
        String cadena = scaner.nextLine();
        int tamaños = cadena.length();
        int totalDEvocales = contadoresDeVocales3(cadena);
        System.out.println("El tamaño de la cadena es:  " + tamaños + "  caracteres.");
        System.out.println("La cantidad de vocales en la cadena es: " + totalDEvocales);
    }

    // Método para el Ejercicio 8
    public static void ejercicio8(Scanner sc) {
        // Lógica para el ejercicio 8
        //usamos la funcion replace() para remplazar todas las letras  A por E
        String textos3 = "La lluvia en Mendoza es escasa";
        String textoModificado = textos3.replace('a', 'e');
        System.out.println("texto original :  " + textos3);
        System.out.println(" texto modificado :  " + textoModificado );

    }

    // Método para el Ejercicio 9
    public static void ejercicio9(Scanner sc) {
        // Lógica para el ejercicio 9
        // usamos la funcion charAT() para transforma cada carácter a su código ASCII
        String text0sacodigo = "La lluvia en Mendoza es escasa";
        for ( int x= 0; x < text0sacodigo.length(); x++) {
            char letras= text0sacodigo.charAt(x);
            int codigoAscii= (int) letras;
            System. out.print(codigoAscii + " ");
        }
        System.out.println();

    }

    // Método para el Ejercicio 10
    public static void ejercicio10(Scanner sc) {

        //Mostrar por consola un mensaje
        System.out.println("Ingrese un frase: ");

        //escanear el dato ingresado por el usuario
        String Cadena = sc.nextLine();

        //mostrar valor ingresado por pantalla
        System.out.println("Frase ingresada: "+Cadena );

        //mostrar por consola que ingrese los datos pedidos
        System.out.println("Desea convertir la frase en:");
        System.out.println("Mayúsculas ('1') o Minusculas ('2')");

        //escanear el dato ingresado por el usuario
        int num = sc.nextInt();


        //Creamos un if
        if (num == 1){
            //Convertir Cadena en Mayusculas
            String ValorMayus = Cadena.toUpperCase();

            //mostrar por consola la frase convertida
            System.out.println("Frase en mayusculas: "+ ValorMayus );

        } else if (num == 2) {
            //Convertir Cadena en Minusculas
            String Minus = Cadena.toLowerCase();

            //mostrar por consola la frase convertida
            System.out.println("Frase en minusculas: "+ Minus);

          } else { //si ingresa un valor fuera del rango ( !!1 || !!2)

            //mostrar por consola un mensaje
            System.out.println("Valor ingresado incorrecto o fuera de rango ");
       }


    }

    // Método para el Ejercicio 11
    public static void ejercicio11(Scanner sc) {

        //Pedir al usurio que ingrese dos datos
        System.out.println("Ingrese dos palabras:" );

        //escanear los datos ingresados
        String Palabra1 = sc.nextLine();
        String Palabra2 = sc.nextLine();

        //metodo compareTo
        int Valorcompare = Palabra1.compareTo(Palabra2);
        //metodo CompareToIgnore Case
        int ValorCompareTC = Palabra1.compareToIgnoreCase(Palabra2);



        //metodo equals
        if (Palabra1.equals(Palabra2)) {
            System.out.println("Ambas palabras son iguales, usando el metodo equals");
        }else {
            System.out.println("Las palabras ingresadas no son iguales, usando el metodo equals");
        }

        //metodo compareTo
        if (Valorcompare < 0) {
            System.out.println("La palabra: <"+Palabra1+"> 'es menor que la segunda palabra: <"+Palabra2+"> , usando el metodo compareTo");

        } else if (Valorcompare > 0 ){
            System.out.println("La palabra: <"+Palabra1+"> es mayor que la segunda palabra: <"+Palabra2+"> , usando el metodo compareTo");
        } else {

            System.out.println("Ambas palabras son iguales, usando el metodo compareTo");
        }


        //metodo CompareToIgnoreCase
        if (ValorCompareTC == 0) {
            System.out.println("Ambas palabras son iguales (ignorando Mayusculas e minusculas), usando el metodo CompareToIgnoreCase");

        } else if (ValorCompareTC < 0) {
            System.out.println("La palabra: <"+Palabra1+"> es menor que la segunda palabra: <"+Palabra2+"> , usando el metodo CompareToIgnoreCase");

        }else {
            System.out.println("La palabra: <"+Palabra1+"> es mayor que la segunda palabra: <"+Palabra2+"> , usando el metodo CompareToIgnoreCase");
        }



    }

    // Método para el Ejercicio 12
    public static void ejercicio12(Scanner sc) {

        //mostramos mensaje por consola
        System.out.print("Ingrese una frase:");
        //escanear el dato ingresado por el usuario
        String Cadena = sc.nextLine();




        if (Cadena.length() < 5){ // para evitar un error por insuficientes caracteres

            System.out.println("Caracteres insufiecientes, intente de nuevo");
        }else {

            //metodo substring
            String SubCadena = Cadena.substring(3,5);

            System.out.println("La cuarta y quinta letra de la frase son: "+SubCadena);
        }


    }

    // Método para el Ejercicio 13
    public static void ejercicio13(Scanner sc) {

        //mostramos mensaje por consola
        System.out.println("Ingrese dos frases:");

        //escaneamos valores
        String Cadena1 = sc.nextLine();
        String Cadena2 = sc.nextLine();

        //convertimos en minusculas, para evitar errores
        String cad1 = Cadena1.toLowerCase();
        String cad2 = Cadena2.toLowerCase();



        //metodo contains
        boolean FraseCont = cad1.contains(cad2);

        if (FraseCont) {
            System.out.println("La 2da frase: <" + Cadena2 + ">, esta dentro de la 1ra frase: <" + Cadena1 + ">, usando Contains");
        } else {
            System.out.println("La 2da frase: <" + Cadena2 + ">, NO se encontró dentro de la 1ra frase: <" + Cadena1 + ">, usando Contains");
        }

        //metodo IndexOf
        int FraseIndex = cad1.indexOf(cad2);

        if (FraseIndex != -1 ) {
            System.out.println("La 2da frase: <" + Cadena2 + ">, esta dentro de la 1era frase: <" + Cadena1 + ">, usando IndexOf");
        } else {
            System.out.println("La 2da frase: <" + Cadena2 + ">, NO se encontró dentro de la 1era frase: <" + Cadena1 + ">, usando IndexOf");

        }

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
