package devdojo.maratonajava.introducao;

public class ExerciciosEstruturasDeRepeticaoBreak {
    public static void main(String[] args) {
        double carroValor = 8000;
        double valorParcela ;

        for (int i = 1 ; i <= carroValor ; i++){
            valorParcela = carroValor / i;
            if( valorParcela < 1000){
                System.out.println("Parcela de " + i + "x" + " de " + valorParcela);
            }
        }
    }
}
