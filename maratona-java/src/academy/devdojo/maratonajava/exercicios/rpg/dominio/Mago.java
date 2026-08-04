package academy.devdojo.maratonajava.exercicios.rpg.dominio;

public class Mago extends Personagem implements Curavel{

    protected int mana;

    public Mago(String nome, int vida, int nivel, Elemento elemento, int vidaMaxima, int mana) {
        super(nome, vida, nivel, elemento, vidaMaxima);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println("Lançando cadeia de feitiços");
    }

    @Override
    public void curar(int quantidade) {
        this.vida += quantidade;
        if (vida > vidaMaxima){
            System.out.println("Limite de vida atingido");
            vida -= (vida - vidaMaxima);

        }

    }


}
