package devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
   public String nome;
   public int idade;
    public double [] salarios;

    public void imprimirDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario : salarios) {
            System.out.println(salario);
        }
    }

    public void mediaSalario(){
        double soma = 0;
       for (int num = 0; num < salarios.length; num++){
           soma += salarios[num];
       }
        double media = soma / salarios.length;
        System.out.println(media);
    }
}
