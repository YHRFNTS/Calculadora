package mx.edu.utez;

public class Calculadora {
    // Atributos privados
    private double numero1;
    private double numero2;

    // Atributo protegido
    protected String ultimaOperacion;

    // Constructor por defecto
    public Calculadora() {
        this.numero1 = 0;
        this.numero2 = 0;
        this.ultimaOperacion = "Ninguna";
    }

    public double multiplicar() {
        ultimaOperacion = "Multiplicación";
        return numero1 * numero2;
    }

    public double dividir() {
        ultimaOperacion = "División";
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("⚠ Error: No se puede dividir entre 0");
            return 0;
        }
    }


    // Constructor con parámetros
    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.ultimaOperacion = "Ninguna";
    }

    // Setters
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}