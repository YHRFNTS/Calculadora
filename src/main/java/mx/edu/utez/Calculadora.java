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
}
