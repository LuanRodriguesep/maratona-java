package devdojo.maratonajava.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou fazer essa caridade.";
        String mensagemNaoDoar = "Eu não vou conseguir fazer essa caridade.";
        String resultado = salario > 6000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}

