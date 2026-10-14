package academy.devdojo.maratonajava.exercicios.banksystem.model;

import academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.SaldoInsuficienteException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ValorInvalidoException;

public abstract class Conta {
    private int numero;
    protected double saldo;
    private Cliente titular;
    private StatusConta status;
    private static int proxNum;

    public Conta(Cliente titular) {
        this.titular = titular;
        this.status = StatusConta.ATIVA;
        this.numero = ++proxNum;
    }

    public Conta(Cliente titular, double saldo) {
        this(titular);
        this.saldo = saldo;
    }

    public void depositar(double valor)throws ValorInvalidoException {
        if (valor <=0){
            throw new ValorInvalidoException("Valor inválido");
        } else {
            saldo += valor;
            System.out.println("Valor depositado: " + valor);
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        this.saldo -= valor;

    }

    public abstract double calcularTarifaMensal();

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public StatusConta getStatus() {
        return status;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", titular=" + titular +
                ", status=" + status +
                '}';
    }
}
