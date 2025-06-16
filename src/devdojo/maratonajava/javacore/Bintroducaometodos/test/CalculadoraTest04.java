package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;


        calculadora.alteraDoisNumeros(num1, num2);

        System.out.println("Dentro do calculadoratest04");
        System.out.println();
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
