package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Duduzinho";
        funcionario.idade = 5;
        funcionario.salarios = new double[]{250, 300, 600};

        System.out.println("Dados do funcionario: ");
        funcionario.imprimirDados();

        System.out.println("---------------------");

        System.out.println("Media e salarios: ");
        funcionario.mediaSalario();

    }
}
