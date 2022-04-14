package com.main;

public class Conta {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public Conta(int numeroDaConta, String nomeDoTitular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
    }

    public Conta(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor + 5;
    }

    @Override
    public String toString() {
        String string = String.format(
                "Nome: %s\nNúmero da conta: %d\nSaldo: %.2f\n",
                getNomeDoTitular(),
                getNumeroDaConta(),
                getSaldo());
        return string;
    }

}
