package academy.devdojo.maratonajava.exercicios.rpg.dominio;

public class Guerreiro extends Personagem{

    protected String espada;

    public Guerreiro(String nome, int vida, int nivel, Elemento elemento, int vidaMaxima, String espada) {
        super(nome, vida, nivel, elemento, vidaMaxima);
        this.espada = espada;
    }



    @Override
    public void atacar() {
        System.out.println("Brandindo espada");
    }

}


