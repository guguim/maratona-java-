package academy.devdojo.maratonajava.exercicios.banksystem.model;

import academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.SaldoInsuficienteException;
import academy.devdojo.maratonajava.exercicios.banksystem.exceptions.ValorInvalidoException;

import static academy.devdojo.maratonajava.exercicios.banksystem.enums.StatusConta.ATIVA;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;
    private static final double TARIFA_MENSAL = 15;


    public ContaCorrente(Cliente titular, double limiteChequeEspecial) {

        super(titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
        if (valor <= 0){
            throw new ValorInvalidoException("Valor inválido");
        } else if (valor <= saldo + limiteChequeEspecial) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return TARIFA_MENSAL;

    }


    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "limiteChequeEspecial=" + limiteChequeEspecial +
                ", saldo=" + saldo +
                ", número da conta=" +getNumero() +
                '}';
    }
}
