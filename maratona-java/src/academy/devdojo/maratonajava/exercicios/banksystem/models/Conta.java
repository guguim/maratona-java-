package academy.devdojo.maratonajava.exercicios.banksystem.models;

import academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta;

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

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
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
