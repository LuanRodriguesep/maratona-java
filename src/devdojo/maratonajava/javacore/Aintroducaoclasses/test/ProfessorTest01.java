package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Jiraya";
        professor.idade = 150;
        professor.sexo = 'M';

        System.out.println("nome: " + professor.nome + "/ idade: " + professor.idade + "/ sexo: " + professor.sexo);
    }
}


// Exemplo de coesão:

// * Separar as classes de acordo com suas especificações
// * Direcionar um proposito por classe
// * Fica mais facil pra escalonar o codigo, e dar manutenção.