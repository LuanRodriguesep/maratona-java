package devdojo.maratonajava.javacore.Dconstrutores.test;

import devdojo.maratonajava.javacore.Dconstrutores.dominio.TimesDeFutebol;

public class TimeDeFutebol01 {

    public static void main(String[] args) {
        TimesDeFutebol timeDeFutebol01 = new TimesDeFutebol("Portuguesa");
        TimesDeFutebol timeDeFutebol02 = new TimesDeFutebol("Boca Juniors", "Argentina");
        TimesDeFutebol timeDeFutebol03 = new TimesDeFutebol("Palmeiras", "Brasileira", 3);

        timeDeFutebol01.mostrarDetalhes();
        timeDeFutebol02.mostrarDetalhes();
        timeDeFutebol03.mostrarDetalhes();
    }
}