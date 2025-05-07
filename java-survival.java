/******************************************************************************

Criação do mostrarMenu - 29/04/2025
Lucas Soares

Criação dos carregarCreditos - 29/04/2025
Nicolas Ferreira

Criação dos nivelDeJogo - 30/04/2025
Lucas Soares

Criação do escolherNickName - 30/04/2025
Lucas Soares

Criação do mostrarInstrucoes - 30/04/2025
Diego Sarti

Criação do apresentarIntroducao - 05/05/2025
Nicolas Ferreira

Criação do VidaPersonagem - 07/05/2025
Lucas Soares

*******************************************************************************/
import java.util.*;
public class Main {
    
    /**
     * Menu principal do jogo
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-04-29
    */
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
    
    /**
     * Menu de Nivel de Dificuldade
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-04-30
    */
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
    
    /**
     * Introdução e Tutorial do jogo.
     * @author Diego Sarti
     * @version 1.0
     * @since 2025-04-30
    */
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
    
    /**
     * Créditos do jogo e agradecimentos.
     * @author Nicolas Ferreira
     * @version 1.0
     * @since 2025-04-29
    */
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
    
    /**
     * Escolher o NickName do Jogador.
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-04-30
    */
    public static void escolherNickName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== Escolha de Nick ==========");
        System.out.print("Escolha o nome do personagem: ");
        String nickname = scanner.next();
        System.out.println("Este nome ira te acompanhar pelo resto do jogo e NÃO podera ser trocado." + "\n" +
        "Você tem certeza que quer esse nome? [S/N]");
        char confirmaNome =  scanner.next().toLowerCase().charAt(0); // Vai pegar a resposta do jogador e colocar sempre em letra minuscula
        
        switch(confirmaNome){
            case 's': // Vai definir o nome do jogador
                // introducao();
                System.out.println("Nome definido: " + nickname);
                apresentarIntroducao();
                break;
            case 'n': // Vai fazer a pergunta do nome novamente
                escolherNickName();
                break;
            default: // Vai fazer a pergunta do nome novamente
                System.out.println("Opção inválida! Tente novamente.");
                escolherNickName();
        }
    }
    
    /**
     * Apresenta a Introdução do jogo.
     * @author Nicolas Ferreira
     * @version 1.0
     * @since 2025-05-05
    */
    public static void apresentarIntroducao() {
        System.out.println("========== Introdução ==========");
        
        System.out.println("O ano é 2147, em um mundo digital distópico controlado por uma superinteligência conhecida como \"Mainframe\".");
        System.out.println("Essa inteligência foi criada para organizar a programação de todas as máquinas e sistemas do mundo, mas algo deu errado.");
        System.out.println("O Mainframe se corrompeu e agora governa uma cidade virtual fechada, onde os habitantes estão presos em um ciclo infinito, sem poder acessar o mundo exterior.");
        System.out.println("\n" + "O último Programador é você " + ", uma pessoa que ainda possui conhecimento suficiente para modificar o código que mantém o Mainframe funcionando.");
        System.out.println("Você foi capturado e aprisionado dentro de um servidor de dados, e sua missão é escapar e restaurar a liberdade, atacando as falhas no código do Mainframe.");
        System.out.println("Para isso, você precisará aprender programação básica para reprogramar o sistema e abrir as portas para a liberdade.");
        vidaPersonagem();
    }// nickname + 
    
    
    /**
     * Mostra a vida do jogador.
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-05-07
    */
    public static void vidaPersonagem() {
        System.out.println("========== Vida do Personagem ==========");
        int vida = 3;
        System.out.println("❤️ : " + vida);
    }

    /**
     * printa o Menu principal do jogo
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-04-29
    */
    public static void main(String[] args) {
        mostrarMenu(); // Printa o Menu principal do jogo.
    }
}