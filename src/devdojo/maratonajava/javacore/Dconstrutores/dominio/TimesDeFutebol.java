package devdojo.maratonajava.javacore.Dconstrutores.dominio;

import java.sql.Time;

public class TimesDeFutebol {
    private String nome;
    private String liga;
    private int titulosLibertadores;

    public TimesDeFutebol(String nome){
        this.nome = nome;
    }

    public TimesDeFutebol(String nome, String liga){
        this(nome);
        this.liga = liga;
    }
    public TimesDeFutebol(String nome, String liga, int TitulosLibertadores){
        this(nome, liga);
        this.titulosLibertadores = titulosLibertadores;
    }
    public void mostrarDetalhes() {
        System.out.println("time: " + nome);
        System.out.println("liga: " + liga);
        System.out.println("N° Libertadores: " + titulosLibertadores);
        System.out.println("-----------------------------------------------");
    }
}
