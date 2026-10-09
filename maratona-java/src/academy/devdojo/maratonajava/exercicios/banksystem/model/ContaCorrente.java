package academy.devdojo.maratonajava.exercicios.banksystem.model;

import academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta;

import static academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta.ATIVA;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;


    public ContaCorrente(Cliente titular, double limiteChequeEspecial) {

        super(titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        StatusConta status = getStatus();

        if (valor < 0) {
            System.err.println("Você não pode sacar valores negativos");
        } else if (status == ATIVA) {

        } else if (valor <= this.saldo + limiteChequeEspecial) {
            this.saldo -= valor;
            System.out.println(this.saldo);
        } else {
            System.err.println("Você não tem saldo suficiente");

        }

    }

    @Override
    public double calcularTarifaMensal() {
        return 0;
    }


    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limiteChequeEspecial=" + limiteChequeEspecial +
                ", saldo=" + saldo +
                '}';
    }
}
