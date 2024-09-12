

public class OperacionMatematica {
   private double valor1;
   private double valor2;
   private String operacion;


    private double sumarNumeros(){
        return valor1 + valor2;
    }
    private double restarNumeros(){
        return valor1 - valor2;
    }
    private double multiplicarNumeros(){
        return valor1 * valor2;
    }
    private double dividirNumeros(){
        return valor1 / valor2;
    }
    public double aplicarOperacion(String operacion) {
        switch (operacion) {
            case "+":
              return  sumarNumeros();
            case "-":
                return restarNumeros();

            case "*":
               return  multiplicarNumeros();

            case "/":
                return dividirNumeros();
                default:
                    return 0;


        }
    }




    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public void setValor2(double valor2) {
    this.valor2 = valor2;}

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    public double getValor1() {
        return valor1;
    }
    public double getValor2() {
        return valor2;
    }
    public String getOperacion() {
        return operacion;
    }
}
