package academy.devdojo.maratonajava.exercicios.banksystem;

import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ContaNaoEncontradaException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.SaldoInsuficienteException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ValorInvalidoException;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Cliente;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Conta;
import academy.devdojo.maratonajava.exercicios.banksystem.model.ContaCorrente;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Endereco;
import academy.devdojo.maratonajava.exercicios.banksystem.services.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        do {
            System.out.println("Bem vindo ao seu Sistema de Banco, escolha alguma das opções abaixo");
        } while (opcao != 7);{
            switch (opcao){
                case 1:
                    System.out.println();
                    break;
            }

        }



    }

}
