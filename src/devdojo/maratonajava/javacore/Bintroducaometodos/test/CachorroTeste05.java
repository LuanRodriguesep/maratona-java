package devdojo.maratonajava.javacore.Bintroducaometodos.test;

import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Cachorro;
import devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraCachorro;

public class CachorroTeste05 {
    public static void main(String[] args) {
        Cachorro cachorro01 = new Cachorro();
        Cachorro cachorro02 = new Cachorro();
        ImpressoraCachorro impressora = new ImpressoraCachorro();

        cachorro01.nome = "Amora";
        cachorro01.idade = 7;
        cachorro01.sexo = 'F';

        cachorro02.nome = "Abel";
        cachorro02.idade = 3;
        cachorro02.sexo = 'M';


        impressora.imprime(cachorro01);

        System.out.println(cachorro01.nome);
        System.out.println(cachorro01.idade);
        System.out.println(cachorro01.sexo);

        System.out.println("------------------------------");

        System.out.println(cachorro02.nome);
        System.out.println(cachorro02.idade);
        System.out.println(cachorro02.sexo);
    }
}
