package devdojo.maratonajava.introducao;

public class ArraysMultiDimenssionaisParte2 {
    public static void main(String[] args) {
        // Criando um array de 3 posições, e em cada posição determino seu tamanho


        // posição 0 , tem 3 posições com os valores 0,1 e 2
        // posição 1, tem 4 posições 3,4,5 e 6
        // posição 2, tem 6 posições 7,8,9,10,11 e 12

        int [][] arrayInt2 = {{0,1,2}, {3,4,5,6}, {7,8,9,10,11,12}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n------"); // codigo somente para organizar um pouco na hora de imprimir na tela, o \n quebra linhas
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
    }
}
