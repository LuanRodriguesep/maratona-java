package devdojo.maratonajava.introducao;

public class Arrays {
    public static void main(String[] args) {

        // byte, short, int,  long,  float,  e double  = 0
        // char '/u0000'
        // boolean =  false
        // String  = null


        String[] nomes = new String[3];
        nomes[0] = "Dudu";
        nomes[1] = "Amora";
        nomes[2] = "Abel";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome na posicao " + i + ": "  + nomes[i]);
        }
    }
}