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
        if (valor <= 0){
            System.out.println("Valor inválido");
        } else if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        double percentual = 2.0/100;
        return saldo * (saldo * percentual);

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
