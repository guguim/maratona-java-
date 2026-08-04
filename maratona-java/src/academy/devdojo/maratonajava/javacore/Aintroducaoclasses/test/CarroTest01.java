package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Cruze";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2015;

        carro2.nome = "Azera";
        carro2.modelo = "Hyundai";
        carro2.ano = 2018;

        System.out.println("Carro 1: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }

}
