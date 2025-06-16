package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Metodo somar");
        calculadora.somaDoisNumeros();

        System.out.println("metodo subtrair");
        calculadora.subtrairDoisNumeros();


        System.out.println("metodo multiplicador");
        calculadora.multiplicador(2, 6.5F);

    }
}
