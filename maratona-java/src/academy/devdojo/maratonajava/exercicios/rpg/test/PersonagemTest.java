package academy.devdojo.maratonajava.exercicios.rpg.test;

import academy.devdojo.maratonajava.exercicios.rpg.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class PersonagemTest {
    public static void main(String[] args) {
        Personagem personagem = new Guerreiro("Guts", 300, 100, Elemento.AGUA, 500, "GreatSword");
        Personagem personagem2 = new Mago("Sciona", 100, 200, Elemento.FOGO, 500, 100);
        Personagem personagem3 = new Arqueiro("Odisseu", 150, 80, Elemento.TERRA, 300, "Veneno");

        List <Personagem> list = new ArrayList<>();
        list.add(personagem);
        list.add(personagem2);
        list.add(personagem3);

        for (Personagem personagens : list){
            personagens.mostrarStatus();
            personagens.atacar();
            System.out.println("============================================");
            if (personagens instanceof Mago){
                ((Mago) personagens).curar(20);
            }

        }



    }
}
