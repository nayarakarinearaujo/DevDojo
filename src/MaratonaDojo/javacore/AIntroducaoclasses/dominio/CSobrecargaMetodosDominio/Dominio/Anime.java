package MaratonaDojo.javacore.AIntroducaoclasses.dominio.CSobrecargaMetodosDominio.Dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    //Método set resumido
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //Sobrecarga de métodos
    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return this.genero;
    }

}
