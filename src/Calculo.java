public class Calculo {
    public static void main(String[] args) {
        realizarCalculos();
    }


    public static void realizarCalculos() {
        OperacionMatematica calculo = new OperacionMatematica();
        calculo.setValor1(5);
        calculo.setValor2(10);

        calculo.setOperacion("+");
        System.out.println("La suma de " + calculo.getValor1() + " y " + calculo.getValor2() + " es " + calculo.aplicarOperacion(calculo.getOperacion()));

        calculo.setOperacion("-");
        System.out.println("La resta de " + calculo.getValor1() + " y " + calculo.getValor2() + " es " + calculo.aplicarOperacion(calculo.getOperacion()));

        calculo.setOperacion("*");
        System.out.println("La multiplicación de " + calculo.getValor1() + " y " + calculo.getValor2() + " es " + calculo.aplicarOperacion(calculo.getOperacion()));

        calculo.setOperacion("/");
        System.out.println("La división de " + calculo.getValor1() + " y " + calculo.getValor2() + " es " + calculo.aplicarOperacion(calculo.getOperacion()));
    }
}
