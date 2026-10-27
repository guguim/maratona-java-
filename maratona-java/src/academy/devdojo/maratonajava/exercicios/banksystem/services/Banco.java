package academy.devdojo.maratonajava.exercicios.banksystem.services;

import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ContaNaoEncontradaException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.SaldoInsuficienteException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ValorInvalidoException;
import academy.devdojo.maratonajava.exercicios.banksystem.model.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println(conta);
    }

    public Conta buscarConta(int numero) throws ContaNaoEncontradaException {
        for (Conta i : contas) {
            if (i.getNumero() == numero) {
                return i;
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada");
    }

    public void depositar(int numero, double valor) throws ContaNaoEncontradaException, ValorInvalidoException {
        Conta conta = buscarConta(numero);
        conta.depositar(valor);

    }

    public void sacar(int numero, double valor) throws ContaNaoEncontradaException, ValorInvalidoException, SaldoInsuficienteException {
        Conta conta = buscarConta(numero);
        conta.sacar(valor);
    }

}
