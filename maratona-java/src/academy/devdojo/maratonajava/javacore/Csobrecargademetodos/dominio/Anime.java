package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(){



    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }
    public void init(String nome, String tipo, int episodios ,String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println("Nome do anime: " + nome);
        System.out.println("Anime: " + tipo);
        System.out.println("Episodios: " + episodios);
        System.out.println("Genero: " + genero);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;

    }

    public String getTipo() {
        return this.tipo;

    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return this.episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
