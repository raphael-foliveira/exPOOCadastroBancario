package com.main;

import java.util.ArrayList;

public class GerenciadorDeContas {

    ArrayList<Conta> todasAsContas;

    GerenciadorDeContas() {
        todasAsContas = new ArrayList<>();
    }

    public void cadastrarConta() {
        Conta novaConta;
        int numeroDaConta = Interface.getInt("Número da conta: ");
        String nomeDoTitular = Interface.getString("Nome: ");

        String fazerDepositoInicial = Interface.getString("Deseja fazer um depósito inicial? (s/n): ");

        if (fazerDepositoInicial.equals("s")) {
            double depositoInicial = Interface.getDouble("Depósito inicial: ");
            novaConta = new Conta(numeroDaConta, nomeDoTitular, depositoInicial);
        } else {
            novaConta = new Conta(numeroDaConta, nomeDoTitular);
        }

        todasAsContas.add(novaConta);
        System.out.println("\n\n");
        System.out.println("Dados da conta: ");
        System.out.println(novaConta);

    }

    public void fazerDeposito() {
        int numeroDaConta = Interface.getInt("Número da conta: ");
        double valorParaDepositar = Interface.getDouble("Valor para depósito: ");
        Conta contaParaDeposito = this.buscarContaPorNumero(numeroDaConta);
        contaParaDeposito.depositar(valorParaDepositar);
        System.out.println("Depósito feito com sucesso!");
        System.out.println("\n");
        System.out.println(contaParaDeposito);
    }

    public void fazerSaque() {
        int numeroDaConta = Interface.getInt("Número da conta: ");
        double valorParaDepositar = Interface.getDouble("Valor para saque: ");
        Conta contaParaSaque = this.buscarContaPorNumero(numeroDaConta);
        contaParaSaque.sacar(valorParaDepositar);
        System.out.println("Saque feito com sucesso!");
        System.out.println("\n");
        System.out.println(contaParaSaque);
    }

    public Conta buscarContaPorNumero(int numeroDaConta) {
        for (Conta conta : todasAsContas) {
            if (conta.getNumeroDaConta() == numeroDaConta) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public void mostrarContas() {
        for (Conta conta : todasAsContas) {
            System.out.println(conta);
        }
    }

    public int getOpcaoDoMenu() {
        Interface.printMenu();
        int opcaoUsario = Interface.getInt(">>> ");
        return opcaoUsario;
    }

}
