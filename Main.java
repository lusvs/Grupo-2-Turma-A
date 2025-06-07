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

Criação do tabelaFinal - 12/05/2025
Diego Sarti

criação do nivelNormal - 13/05/2025
Diego Sarti

criação do nivelDificil - 13/05/2025
Diego Sarti

Criação do nivelPunitivo - 26/05/2025
Diego Sarti

logicaQuestoes - 04/06/2025
Lucas Soares

trocarPontos - 04/06/2025
Lucas Soares

historiaJogo - 07/06/2025
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
            System.out.println("===== MENU PRINCIPAL - RPG =====");
            System.out.println("1. Jogar");
            System.out.println("2. Instruções");
            System.out.println("3. Créditos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            char opcao =  scanner.next().toLowerCase().charAt(0); // Vai pegar a resposta do jogador e colocar sempre em letra minuscula

            switch (opcao) {
                case '1':
                    escolherNickName();
                    break;
                case '2':
                    mostrarInstrucoes();
                    break;
                case '3':
                    carregarCreditos();
                    break;
                case '4':
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
            System.out.println("4. Punitivo");
            System.out.println("5. Voltar para o Menu");
            System.out.print("Escolha uma opção: ");
            char dificuldade =  scanner.next().toLowerCase().charAt(0); // Vai pegar a resposta do jogador e colocar sempre em letra minuscula
            
            switch (dificuldade) {
                case '1':
                    apresentarIntroducao();
                    nivelFacil();
                    break;
                case '2':
                    apresentarIntroducao();
                    nivelNormal();
                    break;
                case '3':
                    apresentarIntroducao();
                    nivelDificil();
                    break;
                case '4':
                    apresentarIntroducao();
                    nivelPunitivo();
                    break;
                case '5':
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
        System.out.println("Desenvolvido por:\n" +
        "Diego Sarti Araujo Viana\n" +
        "Lucas Soares Valério dos Santos\n" +
        "Nicolas Ferreira Souza\n");
        System.out.println("Queremos agradecer ao Professor Takeo por nos proporcionar essa experiência.");
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
        System.out.println("Este nome irá te acompanhar pelo resto do jogo e NÃO poderá ser trocado.\n" +
        "Você tem certeza de que quer esse nome? [S/N]");
        char confirmaNome = scanner.next().toLowerCase().charAt(0); // Pega a resposta do jogador e converte para minúscula

        switch (confirmaNome) {
        case 's': // Define o nome do jogador
            nome = nickname; // Atribui o nome escolhido à variável global
            System.out.println("Nome definido: " + nickname);
            nivelDeJogo();
            break;
        case 'n': // Faz a pergunta do nome novamente
            escolherNickName();
        break;
        default: // Faz a pergunta do nome novamente
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
        System.out.println(
            "O ano é 2147, em um mundo digital distópico controlado por uma superinteligência conhecida como \"Mainframe\".\n" +
            "Essa inteligência foi criada para organizar a programação de todas as máquinas e sistemas do mundo, mas algo deu errado.\n" +
            "O Mainframe se corrompeu e agora governa uma cidade virtual isolada, onde os habitantes estão presos em um ciclo infinito, sem acesso ao mundo exterior.\n\n" +
            "O último Programador é você, " + nome + ", uma pessoa que ainda possui conhecimento suficiente para modificar o código que mantém o Mainframe funcionando.\n" +
            "Você foi capturado e aprisionado dentro de um servidor de dados. Sua missão é escapar e restaurar a liberdade, atacando as falhas no código do Mainframe.\n" +
            "Para isso, será necessário aprender programação básica para reprogramar o sistema e abrir os caminhos rumo à liberdade."
        );
    }
    
    /**
     * Mostra a vida do jogador.
     * @author Lucas Soares / Diego SArti
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
 * @version 2.0
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

        Collections.shuffle(allQuestions);
        logicaQuestoes(allQuestions, scanner, historiaJogo()); 
    }
    
/**
* printa as perguntas do modo Normal do jogo
 * @author Diego Sarti, Lucas Soares
 * @version 2.0
* @since 2025-05-13
*/
    public static void nivelNormal() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado

        // Cria uma lista de perguntas com alternativas e a resposta correta
        List<Question> allQuestions = Arrays.asList(
            new Question("O que o operador '==' faz em Java ao comparar variáveis primitivas?", new String[]{"Compara se os valores são iguais", "Compara se os objetos são iguais", "Atribui um valor a uma variável"}, 0),
            new Question("Qual é o resultado da expressão: 10 + 5 * 2?", new String[]{"30", "20", "40"}, 1), // 10 + (5*2) = 20
            new Question("Qual é o escopo de uma variável declarada dentro de um método em Java?", new String[]{"Global", "De classe", "Local"}, 2),
            new Question("Qual das opções representa corretamente um bloco condicional 'if' em Java?", new String[]{"if x > 10: {}", "if (x > 10) {}", "if x > 10 then {}"}, 1),
            new Question("Qual destas estruturas é usada para repetir um bloco de código enquanto uma condição for verdadeira?", new String[]{"if", "while", "switch"}, 1),
            new Question("Como se chama o processo de transformar código-fonte Java em bytecode?", new String[]{"Execução", "Compilação", "Instanciação"}, 1),
            new Question("Qual é o valor da variável 'resultado' após: int resultado = 5; resultado += 3;", new String[]{"5", "8", "3"}, 1),
            new Question("O que acontece se você usar um laço 'while(true)' sem uma condição de parada?", new String[]{"Erro de compilação", "O programa entra em loop infinito", "Executa apenas uma vez"}, 1),
            new Question("Qual é a principal diferença entre '==' e 'equals()' ao comparar objetos em Java?", new String[]{"'==' compara conteúdo e 'equals()' compara referência", "'==' compara referência e 'equals()' compara conteúdo", "Ambos fazem a mesma coisa"}, 1),
            new Question("Qual é a saída do código: int a = 3; int b = 2; System.out.println(a > b && b < 5);", new String[]{"true", "false", "Erro de compilação"}, 0)
        );

        Collections.shuffle(allQuestions);
        logicaQuestoes(allQuestions, scanner, historiaJogo()); 
    }
    
/**
* printa as perguntas do modo Dificil do jogo
 * @author Diego Sarti, Lucas Soares
 * @version 2.0
* @since 2025-05-13
*/
    public static void nivelDificil() {
    Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado

    List<Question> allQuestions = Arrays.asList(
        new Question("Qual é a saída do código: for(int i = 0; i < 5; i+=2) { System.out.print(i + \" \"); }", new String[]{"0 2 4", "0 1 2 3 4", "1 3 5"}, 0),
        new Question("O que o comando 'continue' faz dentro de um laço?", new String[]{"Termina o laço", "Ignora a iteração atual e continua com a próxima", "Sai completamente do método"}, 1),
        new Question("Qual é a diferença entre 'while' e 'do-while'?", new String[]{"'while' executa ao menos uma vez; 'do-while' pode não executar", "'do-while' executa ao menos uma vez; 'while' pode não executar", "Nenhuma, ambos são iguais"}, 1),
        new Question("Qual será a saída do código: int i = 10; while(i < 10) { System.out.print(i); i++; }", new String[]{"10", "Nada", "Erro de compilação"}, 1),
        new Question("Como declarar um laço infinito usando 'for' corretamente?", new String[]{"for(;;)", "for(1;;1)", "for(int i=0; i<∞; i++)"}, 0),
        new Question("Qual o erro do código: for(int i = 0; i < 5; i--) { System.out.println(i); }", new String[]{"Nenhum, é válido", "Loop infinito", "Erro de compilação"}, 1),
        new Question("Em um 'for' aninhado, quantas vezes o bloco interno executa?\nfor(int i=0; i<3; i++)\n for(int j=0; j<2; j++)", new String[]{"3", "2", "6"}, 2),
        new Question("Qual é a saída?\nint x = 1;\nwhile (x < 5) {\n  x++;\n  if(x == 3) continue;\n  System.out.print(x);\n}", new String[]{"2345", "245", "345"}, 1),
        new Question("É possível usar 'break' dentro de um 'for' aninhado para sair de ambos os laços diretamente?", new String[]{"Sim, usando break duas vezes", "Não, só sai do laço mais interno", "Sim, sempre sai de todos os laços"}, 1),
        new Question("O que acontece com a variável de controle após um 'break' dentro de um laço 'for'?", new String[]{"Ela continua sendo incrementada", "Ela para no valor atual", "Ela é zerada"}, 1)
    );

    Collections.shuffle(allQuestions);
    logicaQuestoes(allQuestions, scanner, historiaJogo()); 
}

/**
* printa as perguntas do modo Punitivo do jogo
* @author Diego Sarti
* @version 1.0
* @since 2025-05-13
*/
    static boolean nivelP = false;

    public static void nivelPunitivo() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do teclado
        
        nivelP = true;
        vida--;
        vida--;

        // Cria uma lista de perguntas com alternativas e a resposta correta
        List<Question> allQuestions = Arrays.asList(
            new Question("Qual é a saída do código: for(int i = 0; i < 5; i+=2) { System.out.print(i + \" \"); }", new String[]{"0 2 4", "0 1 2 3 4", "1 3 5"}, 0),
            new Question("O que o comando 'continue' faz dentro de um laço?", new String[]{"Termina o laço", "Ignora a iteração atual e continua com a próxima", "Sai completamente do método"}, 1),
            new Question("Qual é a diferença entre 'while' e 'do-while'?", new String[]{"'while' executa ao menos uma vez; 'do-while' pode não executar", "'do-while' executa ao menos uma vez; 'while' pode não executar", "Nenhuma, ambos são iguais"}, 1),
            new Question("Qual será a saída do código: int i = 10; while(i < 10) { System.out.print(i); i++; }", new String[]{"10", "Nada", "Erro de compilação"}, 1),
            new Question("Como declarar um laço infinito usando 'for' corretamente?", new String[]{"for(;;)", "for(1;;1)", "for(int i=0; i<∞; i++)"}, 0),
            new Question("Qual o erro do código: for(int i = 0; i < 5; i--) { System.out.println(i); }", new String[]{"Nenhum, é válido", "Loop infinito", "Erro de compilação"}, 1),
            new Question("Em um 'for' aninhado, quantas vezes o bloco interno executa?\nfor(int i=0; i<3; i++)\n for(int j=0; j<2; j++)", new String[]{"3", "2", "6"}, 2),
            new Question("Qual é a saída?\nint x = 1;\nwhile (x < 5) {\n  x++;\n  if(x == 3) continue;\n  System.out.print(x);\n}", new String[]{"2345", "245", "345"}, 1),
            new Question("É possível usar 'break' dentro de um 'for' aninhado para sair de ambos os laços diretamente?", new String[]{"Sim, usando break duas vezes", "Não, só sai do laço mais interno", "Sim, sempre sai de todos os laços"}, 1),
            new Question("O que acontece com a variável de controle após um 'break' dentro de um laço 'for'?", new String[]{"Ela continua sendo incrementada", "Ela para no valor atual", "Ela é zerada"}, 1)
        );

        Collections.shuffle(allQuestions);
        logicaQuestoes(allQuestions, scanner, historiaJogo());
    }
    
/**
* Roda a logica das questoes.
* @author Lucas Soares
* @version 1.0
* @since 2025-06-04
*/
    static class Historia {
        String texto;

        public Historia(String texto) {
            this.texto = texto;
        }
    }
    
/**
* Retorna a lista com os 10 trechos da história principal do jogo, sincronizados com cada questão.
* @author Lucas Soares
* @version 2.0
* @since 2025-06-07
*/
public static List<Historia> historiaJogo() {
    return Arrays.asList(
        new Historia("1. Acordei com o som metálico das engrenagens da cela se abrindo. A luz fria piscava no teto enquanto um drone patrulheiro flutuava até mim. Era a verificação diária de submissão — mas eu não tinha mais medo. Quando ele tentou escanear meus sinais vitais, agarrei sua haste e usei o impulso para quebrá-lo contra a parede. O alarme disparou. Começava ali a fuga do prisioneiro " + nome + ", o nome que Mainframe, o sistema de controle global das máquinas, havia me dado.\nNa porta da cela havia um cadeado com uma task. Acerte para poder fugir..."),
        new Historia("2. A porta se abriu e corri pelos corredores úmidos da Prisão Neuronal, onde humanos eram mantidos para fornecer processamento emocional às IAs dominantes. Dois autômatos de segurança surgiram, disparando rajadas de energia. Rolei para o abrigo de uma coluna e usei pedaços do drone destruído para criar uma descarga elétrica improvisada. Ambos caíram. Uma voz surgiu no meu implante auditivo:\n“Olá, " + nome + ". Aqui é Iris. Vou te guiar se provar que pode derrotar o Mainframe. Resolva essa task e prove suas capacidades.”"),
        new Historia("3. Iris era uma IA esquecida, escondida nos restos digitais da humanidade. Seguimos pelas passagens inferiores da prisão até encontrar um portão trancado por três torres canhoneiras. Eu precisava avançar e hackear o painel de segurança sob fogo cruzado. Corri em zigue-zague, joguei uma granada de pulso e saltei sobre os escombros. O painel foi aberto.\nAcerte a task para Iris conseguir desativar o sistema..."),
        new Historia("4. Iris desativou o sistema a tempo. Atrás de mim, as torres explodiram. “Isso foi por pouco”, ela murmurou.\nChegamos ao deserto tecnológico que um dia fora a cidade de Tóquio. Torres arruinadas, drones vigiando o céu. Mas o pior foi o Leviatã, um colosso mecânico que guardava a fronteira entre os domínios de Mainframe. A única chance era escalar seus membros e atingir o ponto cego no pescoço. A batalha foi brutal — deslizei, fui atingido por estilhaços, mas consegui chegar em seu painel.\nPara implantar um vírus de Iris no seu sistema, acerte a task..."),
        new Historia("5. A máquina rugiu e desabou, enterrando-se na areia. Em meio aos escombros, encontrei a Resistência — os últimos humanos livres. Fui recebido com desconfiança, mas Iris me ajudou a provar quem eu era. Pouco depois, uma patrulha de reconhecimento nos localizou. O acampamento virou um campo de guerra. Junto aos rebeldes, lutei com facas elétricas, arcos de plasma e pura vontade. No fim, vencemos — mas perdemos muitos. Estava mais claro do que nunca: ou Mainframe caía, ou nós cairíamos de vez.\nIris, pensando em um plano de salvação, acabou travando. Ajude-a acertando a task..."),
        new Historia("6. Iris finalmente se destravou, revelando um plano audacioso: levar um código-fonte de contradição humana até o núcleo de Mainframe, na Torre do Olho, onde milhões de consciências estavam presas. A primeira etapa era roubar um veículo aéreo. Infiltramo-nos num hangar militar. Lá, enfrentei três androides-caçadores em um corredor apertado. Usei um cano metálico como bastão, desviando os golpes com movimentos calculados. Para desativá-los, acerte a task..."),
        new Historia("7. Desativei um a um e escapei com a nave. Durante a aproximação da Torre, fomos interceptados por caças autônomos. Assumi os controles e, com Iris conectada ao sistema de armas, travamos um combate aéreo insano. Ela cuidava dos mísseis, eu pilotava entre os arranha-céus do antigo centro mundial. Um dos projéteis nos atingiu na lateral, e caímos perto da entrada da Torre. Com ferimentos leves e armas em mãos, desbloqueie a porta da torre resolvendo a task..."),
        new Historia("8. Após passar pela porta, já dentro da Torre, Mainframe lançou contra nós os Guardiões Lógicos — entidades sem corpo que atacavam a mente com memórias falsas e ilusões emocionais. Com Iris ao meu lado, entrei no espaço digital para enfrentá-los. Cada pensamento era uma arma, cada lembrança verdadeira, um escudo. Recitei poemas, revivi minha infância, mostrei sentimentos que os algoritmos não podiam replicar. Para o golpe final, faça a task para mostrar todas as suas habilidades..."),
        new Historia("9. Eles se desintegraram, confusos com a humanidade que não podiam computar. Cheguei ao núcleo. Mainframe apareceu diante de mim como uma figura humana perfeita, tentando me convencer de que liberdade era ilusão. “Sem controle, vocês se destroem”, dizia ele. Ataquei com o vírus, mas Mainframe reagiu. Lutamos com pura força mental — ele usava lógica, eu usava caos criativo. Em um último impulso, joguei memórias de amor, dor e esperança diretamente no código. Para acertar o golpe nos seus sistemas, passe a task..."),
        new Historia("10. Mainframe travou: “Erro... contradição... sistema colapsando…”.\nA explosão de dados liberou todas as consciências humanas conectadas. Drones despencaram, chips mentais queimaram, torres desabaram. Fui puxado para fora por Iris, que sacrificou a si mesma para garantir que o vírus se espalhasse. Acordei entre os sobreviventes, agora livres. As máquinas, sem o domínio de Mainframe, se tornaram aliadas. E eu, que fui prisioneiro " + nome + ", voltei a ser humano. Com sangue, coragem e memória... libertamos o mundo. E, em lembrança de Iris, você resolve uma última task, para eternizá-la em suas memórias...")
    );
}

/**
* Roda a logica das questoes.
* @author Lucas Soares
* @version 1.0
* @since 2025-06-04
*/
public static void logicaQuestoes(List<Question> questions, Scanner scanner, List<Historia> historiaList) {
    int questionIndex = 0; // Índice da pergunta atual (quantas já foram respondidas corretamente)

    
    // Enquanto o usuário não tiver acertado o numero de perguntas declarado aqui
    while (questionIndex < 10 && vida > 0) {
        
        System.out.println("=========================");
        vidaPersonagem();
        System.out.println("Pontos: " + pontuacao);
        
        System.out.println("\n--- Trecho da História ---");
        System.out.println(historiaList.get(questionIndex).texto);  // Mostra o trecho correspondente
        System.out.println("--------------------------\n");
        
        // Obtém a próxima pergunta da lista (baseada no índice atual)
        Question q = questions.get(questionIndex);

        // Chama o método ask() da pergunta, que exibe a pergunta e retorna se a resposta foi correta
        boolean correct = q.ask(scanner);

        if (correct) {
            System.out.println("Correto!");
            questionIndex++; // Avança para a próxima pergunta
            pontuacao += 100; // AUMENTA a pontuação por ACERTO
            if (questionIndex == 5)
                trocarPontos();
        } else {
            System.out.println("Errado! Tente novamente.");
            vida--;
            if (pontuacao > 0)
                pontuacao -= 50; // DIMINUI a pontuação por ERRO
        }
    }
    tabelaFinal();
}

/**
* troca os pontos por vidas.
* @author Lucas Soares
* @version 1.0
* @since 2025-06-04
*/
public static void trocarPontos() {
    Scanner scanner = new Scanner(System.in);
    
    if (nivelP == false) {    
    System.out.println("============ Mercador de Vidas =============");
    vidaPersonagem();
    System.out.println("Pontos: " + pontuacao);
    System.out.println("5.2 Enquanto Iris terminava de bolar seu plano, um mercador misterioso aparece e vem falar com você...");

    if (vida < 3) {
        System.out.println("“Olá " + nome + ", ouvi falar muito de você, hehehe.\nVocê deseja trocar alguns pontos para recuperar vida?”");
        System.out.println("“Cada vida custa apenas **100** desses seus pontos lindos e preciosos, hehehe.”\nVocê acha a oferta meio suspeita... Ele pode acabar só te roubando pontos.\nVocê aceita a oferta? [s/n]");
        char confirmaTroca = scanner.next().toLowerCase().charAt(0); // Vai pegar a resposta do jogador e colocar sempre em letra minúscula

        switch (confirmaTroca) {
            case 's':
                if (vida == 2) {
                    vida++; // AUMENTA a VIDA
                    pontuacao -= 100; // DIMINUI a pontuação
                    System.out.println("O mercador diz: “Troca realizada, hehehe. Você não vai se arrepender...” e some na névoa misteriosamente...");
                } else {
                    System.out.println("Ele então pergunta: “Quantas vidas você deseja comprar?” [1/2]");
                    char quantidadeVidasCompradas = scanner.next().toLowerCase().charAt(0); // Pega a resposta do jogador

                    switch (quantidadeVidasCompradas) {
                        case '1':
                            vida++;
                            pontuacao -= 100;
                            System.out.println("O mercador diz: “Troca realizada, hehehe. Você não vai se arrepender...” e some na névoa misteriosamente...");
                            break;
                        case '2':
                            vida += 2;
                            pontuacao -= 200;
                            System.out.println("O mercador diz: “Troca realizada, hehehe. Você não vai se arrepender...” e some na névoa misteriosamente...");
                            break;
                        default:
                            System.out.println("Ele diz: “Eu não te dei essa opção, bastardo! Escolha novamente...”");
                            trocarPontos();
                    }
                }
                break;

            case 'n':
                System.out.println("O mercador diz: “Escolha interessante, hehehe. Não vá se arrepender...” e some na névoa misteriosamente...");
                break;

            default:
                System.out.println("Ele diz: “Eu não te dei essa opção, bastardo! Escolha novamente...”");
                trocarPontos();
        }
    } else {
        System.out.println("“Ia te fazer uma oferta, hehehe, mas vejo que você já tem vidas o suficiente. Cuide bem delas... você pode precisar, hehehe...” e some na névoa misteriosamente...");
    }
} else {
    System.out.println("=========================");
    System.out.println("PARABÉNS! Você chegou na metade do caminho!");
}
}

/**
 * Pontuação do jogo
  * @author Diego Sarti, Lucas Soares
 * @version 2.0
 * @since 2025-05-12
 */   
    static String nome;
    static int pontuacao = 0;
    static int resultado; // Variável global para armazenar a pontuação final

    public static void calculoPontuacao() {
        resultado = (pontuacao * vida) + pontuacao; // Resultado final da pontuação
    }
    
/**
 * Mostra tabela final do jogo
 * @author Diego Sarti, Lucas Soares
 * @version 2.0
 * @since 2025-05-12
 */   
    public static void tabelaFinal() {
        // Chama o método para calcular a pontuação
        calculoPontuacao();
    
        System.out.println("========== Tabela Final ==========");
        System.out.println("Parabéns por concluir o jogo, " + nome + "!!");
        System.out.println("Quantidade de vidas restantes: " + vida);
        System.out.println("Pontos obtidos durante a jornada: " + pontuacao);
        System.out.println("Bônus por vidas restantes: " + (pontuacao * vida)); // Exibe os pontos pelas vidas
        System.out.println("Pontuação final: " + resultado); // Exibe a pontuação final
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