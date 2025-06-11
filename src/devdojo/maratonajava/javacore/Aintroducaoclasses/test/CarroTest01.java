package devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Prisma";
        carro.modelo = "Sedan Lts 1.4";
        carro.ano = 2012;

        carro2.nome = "Apolo";
        carro2.modelo = "Vollks Hatch Ap 1.8";
        carro2.ano = 1994;

        System.out.println("Nome: " + carro.nome + "/ modelo: " + carro.modelo + "/ ano: "  + carro.ano);
        System.out.println("Nome: " + carro2.nome + "/ modelo: " + carro2.modelo + "/ ano: "  + carro2.ano);
    }
}
