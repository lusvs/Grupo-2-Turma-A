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

Criação do Question - 11/05/2025
Lucas Soares

Criação do nivelFacil - 11/05/2025
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
                    escolherNickName();
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
            System.out.println("4. Voltar para o Menu");
            System.out.print("Escolha uma opção: ");
            int dificuldade = scanner.nextInt();
            
            switch (dificuldade) {
                case 1:
                    apresentarIntroducao();
                    nivelFacil();
                    break;
                case 2:
                    // modoNormal();
                    System.out.println("=========================");
                    System.out.println("Modo Normal...");
                    apresentarIntroducao();
                    break;
                case 3:
                    // modoDificil();
                    System.out.println("=========================");
                    System.out.println("Modo Dificil...");
                    apresentarIntroducao();
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
                nivelDeJogo();
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
        System.out.println("================================");
        vidaPersonagem();
    }// nickname + 
    
    /**
     * Mostra a vida do jogador.
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-05-07
    */
    static int vida = 3;
    
    public static void vidaPersonagem() {
        System.out.println("❤️ : " + vida);
    }

    /**
     * printa o Menu principal do jogo
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-05-11
    */   
    // Classe interna (estática) que representa uma pergunta do quiz
    static class Question {
        String text;         // Enunciado da pergunta
        String[] options;    // Array com as 3 alternativas de resposta
        int correctIndex;    // Índice da alternativa correta (0 para primeira, 1 para segunda, etc.)

        // Construtor da classe Question
        public Question(String text, String[] options, int correctIndex) {
            this.text = text;                 // Define o enunciado
            this.options = options;           // Define as alternativas
            this.correctIndex = correctIndex; // Define a resposta correta
        }

        // Método que exibe a pergunta e verifica se o usuário respondeu corretamente
        public boolean ask(Scanner scanner) {
            // Exibe o enunciado da pergunta
            System.out.println("\n" + text);

            // Exibe as 3 alternativas, numeradas de 1 a 3
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
             }

            // Solicita a resposta do usuário
            System.out.print("Sua resposta (1-3): ");
            int answer = scanner.nextInt(); // Lê a entrada do usuário como número inteiro

            // Compara a resposta do usuário com a alternativa correta (lembrando que arrays começam em 0)
            return answer == correctIndex + 1;
        }
    }

    /**
     * printa as perguntas do mogo facil do jogo
     * @author Lucas Soares
     * @version 1.0
     * @since 2025-05-11
    */
    public static void nivelFacil() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado

        // Cria uma lista de perguntas com alternativas e a resposta correta
        List<Question> allQuestions = Arrays.asList(
            new Question("Qual palavra-chave é usada para declarar uma variável inteira em Java?", new String[]{"num", "int", "integer"}, 1),
            new Question("Qual dessas variáveis está corretamente declarada em Java?", new String[]{"int numero = 10;", "numero int = 10;", "int = numero 10;"}, 0),
            new Question("Qual tipo de variável é usado para armazenar texto em Java?", new String[]{"String", "Text", "char[]"}, 0),
            new Question("Qual destas variáveis pode armazenar um valor verdadeiro ou falso?", new String[]{"int", "boolean", "float"}, 1),
            new Question("O que acontece se você tentar usar uma variável sem inicializá-la (sem valor atribuído)?", new String[]{"O Java usa zero automaticamente", "O programa ignora a variável", "O compilador acusa erro"}, 2),
            new Question("Qual é o tipo de variável usado para armazenar números decimais em Java?", new String[]{"float", "int", "boolean"}, 0),
            new Question("O que significa a palavra-chave final ao declarar uma variável em Java?", new String[]{"A variável pode ser usada apenas dentro do método", "A variável pode mudar de valor a qualquer momento", "A variável é constante e não pode ser alterada"}, 2),
            new Question("Qual das seguintes declarações está correta para uma variável de caractere único?", new String[]{"char letra = a;", "char letra = 'a';", "char letra = a;"}, 1),
            new Question("Qual dessas variáveis é considerada uma variável de instância (não local)?", new String[]{"Uma variável declarada dentro de um método", "Uma variável declarada fora de métodos, dentro da classe", "Uma variável usada como argumento de função"}, 1),
            new Question("Qual nome de variável é inválido em Java?", new String[]{"_nomeUsuario", "2valor", "total_soma"}, 1)
        );

        // Embaralha a ordem das perguntas para que a sequência seja diferente a cada execução
        Collections.shuffle(allQuestions);

        int questionIndex = 0; // Índice da pergunta atual (quantas já foram respondidas corretamente)

        // Enquanto o usuário não tiver acertado o numero de perguntas declarado aqui
        while (questionIndex < 5) {
            // Obtém a próxima pergunta da lista (baseada no índice atual)
            Question q = allQuestions.get(questionIndex);

            // Chama o método ask() da pergunta, que exibe a pergunta e retorna se a resposta foi correta
            boolean correct = q.ask(scanner);

            // Se a resposta estiver correta, avança para a próxima pergunta
            if (correct) {
                System.out.println("Correto!");
                System.out.println("=========================");
                vidaPersonagem();
                questionIndex++; // Avança para a próxima pergunta
            } else {
                // Se a resposta estiver errada, não avança — a mesma pergunta será repetida e tira uma vida
                System.out.println("Errado! Tente novamente.");
                System.out.println("=========================");
                vida--;
                vidaPersonagem();
            } 
        }
        // Quando todas as 10 perguntas forem respondidas corretamente, o jogo termina
        System.out.println("\nParabéns! Você completou o quiz.");
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