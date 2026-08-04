package academy.devdojo.maratonajava.exercicios.rpg.dominio;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int nivel;
    protected int vidaMaxima;
    protected Elemento elemento;

    public Personagem(String nome, int vida, int nivel, Elemento elemento, int vidaMaxima) {
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.vidaMaxima = vidaMaxima;
        this.elemento = elemento;
    }

    public abstract void atacar();

    public void mostrarStatus(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Nível: " + this.nivel);

    }

}
