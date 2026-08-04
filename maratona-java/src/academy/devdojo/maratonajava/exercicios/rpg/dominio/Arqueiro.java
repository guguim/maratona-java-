package academy.devdojo.maratonajava.exercicios.rpg.dominio;

public class Arqueiro extends Personagem{

    protected String flecha;

    public Arqueiro(String nome, int vida, int nivel, Elemento elemento, int vidaMaxima, String flecha) {
        super(nome, vida, nivel, elemento, vidaMaxima);
        this.flecha = flecha;
    }

    @Override
    public void atacar() {
        System.out.println("Atirando flecha");
    }
}
