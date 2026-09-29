package academy.devdojo.maratonajava.exercicios.banksystem.models;

import academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta;

public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;
    private StatusConta status;
    private static int num;

    public Conta(Cliente titular) {
        this.titular = titular;
    }

    public Conta(Cliente titular, StatusConta status) {
        this.titular = titular;
        this.status = status;
    }

}
