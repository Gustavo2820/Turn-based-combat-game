import java.util.Random;
import java.util.Scanner;

public class Jogar {

    private Personagem jogador;
    private Personagem oponente;
    private Scanner scanner;

    public Personagem getOponente() {
        return oponente;
    }

    public Personagem getJogador() {
        return jogador;
    }

    public Jogar(Personagem jogador) {
        this.jogador = jogador;
        this.oponente = gerarOponenteAleatorio();
        scanner = new Scanner(System.in);
    }

    private Personagem gerarOponenteAleatorio() {
        Random random = new Random();
        int escolhaRaca = random.nextInt(4) + 1; // Gerar um número aleatório entre 1 e 4
        int escolhaClasse = random.nextInt(5) + 1; // Gerar um número aleatório entre 1 e 5

        Raca raca = null;
        Classe classe = null;

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
        }

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
        }

        return new Personagem(raca, classe, "Oponente");
    }

    public void jogar(Personagem jogador, Personagem oponente) {
        System.out.println("Iniciando batalha entre " + jogador.getNome() + " e " + oponente.getNome() + "!");
        boolean jogadorVenceu = false;
        boolean oponenteVenceu = false;

        while (!jogadorVenceu && !oponenteVenceu) {

            //Turno do Jogador
            if(jogador.getEstamina() > 0)
            {
                int atkJogador = escolherAtkJogador();
                jogador.atacar(oponente, atkJogador, 0, jogador.getEstamina(), oponente.getEstamina());
                if(oponente.getHP() <= 0) {
                    System.out.println("\nVocê venceu!!!");
                    jogadorVenceu = true;
                    break;
                }
            }
            else System.out.println(jogador.getNome() + " está sem estamina e não irá atacar essa rodada.\n");

            System.out.println("\nHP do oponente: " + oponente.getHP() + "\nEstamina do Oponente: " + oponente.getEstamina() +"\nHP do jogador: " + jogador.getHP() + "\nEstamina do Jogador: " + jogador.getEstamina());

            //Turno do Oponente
            if (oponente.getEstamina() > 0)
            {
                int atkOponente = escolherAtkOpontente();
                oponente.atacar(jogador, atkOponente, 1, oponente.getEstamina(), jogador.getEstamina());
                if(jogador.getHP() <= 0) {
                    System.out.println("\nOponente venceu!!!");
                    oponenteVenceu = true;
                    break;
                }
            }
            else System.out.println(oponente.getNome() + " está sem estamina e não irá atacar essa rodada.\n");

            System.out.println("\nHP do oponente: " + oponente.getHP() + "\nEstamina do Oponente: " + oponente.getEstamina() +"\nHP do jogador: " + jogador.getHP() + "\nEstamina do Jogador: " + jogador.getEstamina());
            jogador.setEstamina(jogador.getEstamina() + 3);
            oponente.setEstamina(oponente.getEstamina() + 3);
        }
    }

    private int escolherAtkJogador() {

        System.out.println("Escolha o ataque que deseja usar:");
        System.out.println("1 - " + jogador.getClasse().getNomeAtaque(1) +" - 3 de estamina");
        System.out.println("2 - " + jogador.getClasse().getNomeAtaque(2) +" - 5 de estamina");
        System.out.println("3 - " + jogador.getClasse().getNomeAtaque(3) +" - 7 de estamina");
        System.out.println("4 - " + jogador.getClasse().getNomeAtaque(4) +" - 10 de estamina");
        int escolhaAtaque = scanner.nextInt();
        while (escolhaAtaque < 1 || escolhaAtaque > 4) {
            System.out.println("Escolha inválida! Por favor, escolha um número entre 1 e 4:");
            escolhaAtaque = scanner.nextInt();
        }
        return escolhaAtaque;

    }

    private int escolherAtkOpontente() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
