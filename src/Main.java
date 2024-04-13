import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Personagem personagem = null;

        int resp, i;

        System.out.println("Bem-vindo ao Coliseu!");
        do {
            System.out.print("|-----------------------------\n");
            System.out.print("| Opção 1 - Introdução     \n");
            System.out.print("| Opção 2 - Criar Personagem         \n");
            System.out.print("| Opção 3 - Jogar          \n");
            System.out.print("| Opção 4 - Vizualizar Personagem     \n");
            System.out.print("| Opção 0 - Sair              \n");
            System.out.println("|-----------------------------|\n");
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("O Coliseu é um jogo de luta por turnos 1 vs 1, onde você deve criar seu personagem e lutar contra NPCs no Coliseu!");
                    break;
                case 2:
                    // Escolha da raça
                    System.out.println("Escolha a raça do seu personagem:");
                    System.out.println("1 - Humano");
                    System.out.println("2 - Orc");
                    System.out.println("3 - Elfo");
                    System.out.println("4 - Anão");
                    int escolhaRaca = sc.nextInt();
                    Raca raca;
                    switch (escolhaRaca) {
                        case 1:
                            raca = new Humano();
                            break;
                        case 2:
                            raca = new Orc();
                            break;
                        case 3:
                            raca = new Elfo();
                            break;
                        case 4:
                            raca = new Anao();
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                            continue;
                    }

                    // Escolha da classe
                    System.out.println("Escolha a classe do seu personagem:");
                    System.out.println("1 - Guerreiro");
                    System.out.println("2 - Mago");
                    System.out.println("3 - Samurai");
                    System.out.println("4 - Lutador");
                    System.out.println("5 - Arqueiro");
                    int escolhaClasse = sc.nextInt();
                    Classe classe;
                    switch (escolhaClasse) {
                        case 1:
                            classe = new Guerreiro();
                            break;
                        case 2:
                            classe = new Mago();
                            break;
                        case 3:
                            classe = new Samurai();
                            break;
                        case 4:
                            classe = new Lutador();
                            break;
                        case 5:
                            classe = new Arqueiro();
                            break;
                        default:
                            System.out.println("Escolha inválida!");
                            continue;
                    }

                    // Nome do personagem
                    System.out.println("Digite o nome do seu personagem:");
                    sc.nextLine(); // Limpar o buffer
                    String nome = sc.nextLine();

                    // Criar o personagem
                    personagem = new Personagem(raca, classe, nome);
                    System.out.println("Personagem criado com sucesso!");
                    break;
                case 3:
                    if (personagem == null) {
                        System.out.println("Crie um personagem antes de jogar!");
                        break;
                    }
                    Jogar jogo = new Jogar(personagem);
                    jogo.jogar(jogo.getJogador(), jogo.getOponente());
                    break;
                case 4:
                    if (personagem == null) {
                        System.out.println("Crie um personagem antes de visualizar!");
                        break;
                    }
                    personagem.vizualizarPersonagem();
                    break;
                case 0:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (resp != 0);

    }
}