package academy.devdojo.maratonajava.exercicios.banksystem;

import academy.devdojo.maratonajava.exercicios.banksystem.models.Cliente;
import academy.devdojo.maratonajava.exercicios.banksystem.models.Endereco;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Hugo", "5213215", new Endereco("asdsad", 45, "sp", "SP"));
        Cliente c2 = new Cliente("Pedro", "2313215", new Endereco("asdsad", 45, "sp", "SP"));
        System.out.println(c1.equals(c2));



    }

}
