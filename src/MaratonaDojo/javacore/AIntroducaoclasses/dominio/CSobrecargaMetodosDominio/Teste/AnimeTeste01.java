package MaratonaDojo.javacore.AIntroducaoclasses.dominio.CSobrecargaMetodosDominio.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.CSobrecargaMetodosDominio.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Akudama Drive", "IV", 12, "Ação");
        anime.imprime();
    }
}

