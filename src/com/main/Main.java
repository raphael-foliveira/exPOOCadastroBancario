package com.main;

public class Main {
    public static void main(String[] args) {
        int opcaoUsuario = -1;
        GerenciadorDeContas gerenciador = new GerenciadorDeContas();

        do {
            opcaoUsuario = gerenciador.getOpcaoDoMenu();
            switch (opcaoUsuario) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    gerenciador.cadastrarConta();
                    break;
                case 2:
                    gerenciador.fazerDeposito();
                    break;
                case 3:
                    gerenciador.fazerSaque();
                    break;
                case 4:
                    gerenciador.mostrarContas();
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
        } while (opcaoUsuario != 0);
    }
}