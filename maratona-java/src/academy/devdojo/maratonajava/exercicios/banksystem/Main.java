package academy.devdojo.maratonajava.exercicios.banksystem;

import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ContaNaoEncontradaException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.SaldoInsuficienteException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ValorInvalidoException;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Cliente;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Conta;
import academy.devdojo.maratonajava.exercicios.banksystem.model.ContaCorrente;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Endereco;
import academy.devdojo.maratonajava.exercicios.banksystem.services.Banco;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Hugo", "5213215", new Endereco("asdsad", 45, "sp", "SP"));
        Cliente c2 = new Cliente("Pedro", "2313215", new Endereco("asdsad", 45, "sp", "SP"));
        System.out.println(c1.equals(c2));
        ContaCorrente contaCorrente = new ContaCorrente(c1, 100);
        ContaCorrente contaCorrente2 = new ContaCorrente(c1, 100);
        Banco banco = new Banco();


        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaCorrente2);

        try {
            contaCorrente.depositar(100);
        } catch (ValorInvalidoException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(contaCorrente);

        try {
            contaCorrente.sacar(10);
        } catch (SaldoInsuficienteException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println(contaCorrente);

        System.out.println("antes da busca");
        try {
            Conta conta = banco.buscarConta(2);
            System.out.println("achou: " + conta.getNumero());
            System.out.println(conta);
        } catch (ContaNaoEncontradaException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

}
