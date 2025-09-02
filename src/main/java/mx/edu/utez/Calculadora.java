package mx.edu.utez;

public class Calculadora {
    // Atributos privados
    private double numero1;
    private double numero2;

    // Atributo protegido
    protected String ultimaOperacion;

    public double multiplicar() {
        ultimaOperacion = "Multiplicación";
        return numero1 * numero2;
    }
}
