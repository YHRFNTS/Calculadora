package mx.edu.utez;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(12, 4);

        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());
    }
}