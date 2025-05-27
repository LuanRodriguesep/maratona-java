package devdojo.maratonajava.introducao;

public class CondicionaisExercicios {
    public static void main(String[] args) {
        double salario = 100000;
        double imposto ;
        double salarioComImposto;
        String mensagemImposto = "Após pagar os impostos só me sobrou isso ";


        if (salario > 34.742 && salario < 64.507) {
           imposto = (salario * 9.72) / 100;
           salarioComImposto = salario - imposto;
            System.out.println(mensagemImposto + salarioComImposto);
        } if (salario > 68.507) {
            imposto = (salario * 37.35) / 100;
            salarioComImposto = salario - imposto;
            System.out.println(mensagemImposto + salarioComImposto);
        }
    }
}
