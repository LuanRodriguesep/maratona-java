package devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {

        // byte, short, int,  long,  float,  e double  = 0
        // char '/u0000'
        // boolean =  false
        // String  = null


        int [][]dias = new int[3][3]; // array dentro de outro array
        int [] numeros = {10,9,8,7,6,5,4,3,2,1};
        String[] nomes = new String[3];
        nomes[0] = "Dudu";
        nomes[1] = "Amora";
        nomes[2] = "Abel";

        dias [1][2] = 2019;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posicao " + i + ": "  + nomes[i]);
        }

        for(int i : numeros) {
            System.out.println(i);
        }

        System.out.println(numeros[3] + " Teste numero no array");

        System.out.println(dias[1][2]); // array multidimensional


        // Percorrendo o array multidimensional
        for (int i = 0 ; i < dias.length; i++){
            for(int j = 0; j < dias[0].length ; j++){
                System.out.println(dias[i][j]);
            }
        }
    }
}