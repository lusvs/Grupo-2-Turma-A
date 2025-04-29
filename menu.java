/******************************************************************************

Criação do Menu: 29/04/2025

*******************************************************************************/
import java.util.*;

public class Main {
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // do {
            System.out.println("===== MENU PRINCIPAL - RPG =====");
            System.out.println("1. Jogar");
            System.out.println("2. Instruções");
            System.out.println("3. Créditos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // novoJogo();
                    System.out.println("Iniciando o jogo...");
                    break;
                case 2:
                    // carregarInstrucoes();
                    System.out.println("Instruções do jogo...");
                    break;
                case 3:
                    // carregarCreditos();
                    System.out.println("Créditos do jogo...");
                    break;
                case 4:
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        // } while (opcao != 4);
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}