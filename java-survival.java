/******************************************************************************

Criação do mostrarMenu - 29/04/2025
Lucas Soares

Criação do carregarCreditos - 29/04/2025
Nicolas Ferreira

Criação dos nivelDeJogo - 30/04/2025
Lucas Soares

Criação do escolherNickName - 30/04/2025
Lucas Soares

Criação do mostrarInstrucoes - 30/04/2025
Diego Sarti

*******************************************************************************/
import java.util.*;
public class Main {
    
    public static void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
            System.out.println("===== MENU PRINCIPAL - RPG =====");
            System.out.println("1. Jogar");
            System.out.println("2. Instruções");
            System.out.println("3. Créditos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    nivelDeJogo();
                    break;
                case 2:
                    mostrarInstrucoes();
                    break;
                case 3:
                    carregarCreditos();
                    break;
                case 4:
                    System.out.println("=========================");
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    mostrarMenu();
            }
    }
    
    public static void nivelDeJogo() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("===== Dificuldade de Jogo =====");
            System.out.println("1. Fácil");
            System.out.println("2. Normal");
            System.out.println("3. Dificil");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int dificuldade = scanner.nextInt();
            
            switch (dificuldade) {
                case 1:
                    // mofoFacil();
                    System.out.println("=========================");
                    System.out.println("Modo Fácil...");
                    escolherNickName();
                    break;
                case 2:
                    // modoNormal();
                    System.out.println("=========================");
                    System.out.println("Modo Normal...");
                    escolherNickName();
                    break;
                case 3:
                    // modoDificil();
                    System.out.println("=========================");
                    System.out.println("Modo Dificil...");
                    escolherNickName();
                    break;
                case 4:
                    System.out.println("Voltando...");
                    mostrarMenu();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    nivelDeJogo();
            }
    }        
    
    public static void mostrarInstrucoes() {
        
        System.out.println("======== Instruções ========");
        System.out.println("Bem-vindo ao Java Survival, um RPG de texto onde sua inteligência em programação será sua principal arma!\n");

        System.out.println("🎯 Objetivo do Jogo:");
        System.out.println("- Responda corretamente às questões para avançar de nível e acumular pontos.");
        System.out.println("- Se errar, você perde 1 das suas 3 vidas.");
        System.out.println("- Ao perder todas as vidas, o jogo reinicia.\n");

        System.out.println("🧠 Como Jogar:");
        System.out.println("1. Cada missão apresenta uma questão de múltipla escolha.");
        System.out.println("2. Escolha a alternativa correta digitando a letra correspondente (A, B, C, D).");
        System.out.println("3. Acertos fazem você avançar e ganhar pontos.");
        System.out.println("4. Erros fazem você permanecer no nível e perder uma vida.\n");

        System.out.println("💰 Pontuação e Recompensas:");
        System.out.println("- Pontos acumulados são somados no final do jogo.");
        System.out.println("- Você pode trocar pontos por vidas com o Mercador Misterioso durante a jornada.\n");

        System.out.println("🏆 Fim de Jogo:");
        System.out.println("- Ao terminar o jogo, será exibido um resumo com:");
        System.out.println("  * Total de pontos");
        System.out.println("  * Acertos e erros");
        System.out.println("  * Nível alcançado");
        System.out.println("  * Avaliação final\n");

        System.out.println("📌 Dicas Finais:");
        System.out.println("- Leia as questões com atenção.");
        System.out.println("- Gerencie bem suas vidas e seus pontos.");
        System.out.println("- Use o Mercador com sabedoria.");
        System.out.println("- E o mais importante: divirta-se enquanto aprende!\n");

        mostrarMenu();
}
    
    public static void carregarCreditos(){
        System.out.println("========== CRÉDITOS ==========");
        System.out.print("Desenvolvido por: " + "\n" +
        "Diego Sarti Araujo Viana"  + "\n" +
        "Lucas Soares Valerio dos Santos" + "\n" +
        "Nicolas Ferreira Souza");
        System.out.println( "\n" + 
        "Queremos e ao Professor Takeo por nos proporcionar essa experiência.");
        mostrarMenu();
    }
    
    public static void escolherNickName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Escolha de Nick ==========");
        System.out.print("Escolha o nome do personagem: ");
        String nickname = scanner.next();
        System.out.println("Este nome ira te acompanhar pelo resto do jogo e NÃO podera ser trocado." + "\n" +
        "Você tem certeza que quer esse nome? [S/N]");
        char confirmaNome =  scanner.next().toLowerCase().charAt(0);
        
        switch(confirmaNome){
            case 's':
                // introducao();
                System.out.println("=========================");
                System.out.println("Introdução.....");
                System.out.println("Nome definido: " + nickname);
                break;
            case 'n': 
                escolherNickName();
                break;
            default:
                System.out.println("Opção inválida! Tente novamente.");
                escolherNickName();
        }
    }

    public static void main(String[] args) {
        mostrarMenu();
    }
}