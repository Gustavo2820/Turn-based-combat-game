import java.util.Random;
import java.util.Scanner;

public class Personagem {

    private String nome;
    private int especial;
    private Classe classe;
    private Raca raca;
    private int HP;
    private int maxHP;
    private int forca;
    private int destreza;
    private int defesa;
    private int estamina;

    public Personagem(Raca raca, Classe classe, String nome) {
        this.nome = nome;
        this.raca = raca;
        this.classe = classe;
        this.especial = classe.getEspecial() + raca.getEspecial();
        this.maxHP = classe.getMaxHP() + raca.getMaxHP();
        this.forca = classe.getForca() + raca.getForca();
        this.destreza = classe.getDestreza() + raca.getDestreza();
        this.defesa = classe.getDefesa() + raca.getDefesa();
        this.estamina = classe.getEstamina() + raca.getEstamina();
        this.HP = maxHP;
    }

    //Tipo de Personagem, 0 é oponente e 1 é o jogador
    public void atacar(Personagem alvo, int tipoAtaque, int tipoPersonagem, int estaminaAtk, int estaminaDef) {
        int[] ataque;
        switch (tipoAtaque) {
            case 1:
                ataque = classe.ataque1(forca, destreza, defesa, HP, especial, estaminaAtk);
                break;
            case 2:
                ataque = classe.ataque2(forca, destreza, defesa, HP, especial, estaminaAtk);
                break;
            case 3:
                ataque = classe.ataque3(forca, destreza, defesa, HP, especial, estaminaAtk);
                break;
            case 4:
                ataque = classe.ataque4(forca, destreza, defesa, HP, especial, estaminaAtk);
                break;
            default:
                System.out.println("Tipo de ataque inválido!");
                return;
        }
        int destrezaAtk = ataque[0];
        int dmg = ataque[1];
        this.estamina -= ataque[2];
        if(tipoPersonagem == 0) {
            alvo.turnoDefOponente(alvo, dmg, alvo.getHP(),destrezaAtk, estaminaDef);
        }
        else if(tipoPersonagem == 1) {
            alvo.turnoDefJogador(alvo, dmg, alvo.getHP(),destrezaAtk, estaminaDef);
        }
    }

    private void receberDano(int dano) {
        this.setHP(this.getHP() - dano);
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void desvio(int destreza, int HP, int destAtk, int dmgAtk, int destrezaAtk) {
        System.out.println("Tenta desviar do ataque...");
        Random random = new Random();

        int rollAtk = destrezaAtk + random.nextInt(8);
        int rollDesvio = destreza + random.nextInt(10);

        if (rollDesvio >= rollAtk) {
            System.out.println(this.getNome() + " conseguiu desviar!");
        } else {
            System.out.println(this.getNome() + " falhou em desviar e recebeu " + dmgAtk + " de dano!");
            this.receberDano(dmgAtk);
        }
    }

    public void defender(int defesa, int dmgAtk, int HP) {
        Random random = new Random();
        int chanceDefesa = random.nextInt(10); // Gera um número aleatório de 0 a 9

        // Reduzindo o dano com base na defesa do personagem e um fator aleatório
        int dano = (dmgAtk - defesa) - random.nextInt(5); // Fator aleatório entre 0 e 4
        if (dano > 0) {
            this.receberDano(dano);
            System.out.println(this.getNome() + " defendeu parcialmente e recebeu " + dano + " de dano!");
        } else {
            System.out.println(this.getNome() + " bloqueou todo o dano!");
        }
    }

    public void turnoDefOponente(Personagem oponente, int dmgAtk, int HP, int destrezaAtk, int estaminaDef) {
        Random random = new Random();
        int escolha = random.nextInt(2) + 1;

        if(escolha == 1){
            oponente.defender(oponente.getDefesa(), dmgAtk, HP);
            this.estamina -= 3;
        }
        else if(escolha == 2){
            oponente.desvio(oponente.getDestreza(), HP, destrezaAtk, dmgAtk, destrezaAtk);
            this.estamina -= 5;
        }
    }

    public void turnoDefJogador(Personagem personagem, int dmgAtk, int HP, int destrezaAtk, int estaminaDef) {

        System.out.println("Turno de Reação\n1 - Defender (3 de estamina)\n2 - Desviar (5 de estamina)");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        if(escolha == 1){
            personagem.defender(personagem.getDefesa(), dmgAtk, HP);
            this.estamina -= 3;
        }
        else if(escolha == 2){
            personagem.desvio(personagem.getDestreza(), HP, destrezaAtk, dmgAtk, destrezaAtk);
            this.estamina -= 5;
        }
    }

    public int getEspecial() {
        return especial;
    }

    public Classe getClasse() {
        return classe;
    }

    public Raca getRaca() {
        return raca;
    }

    public int getHP() {
        return HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getForca() {
        return forca;
    }

    public int getDestreza() {
        return destreza;
    }

    public int getDefesa() {
        return defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getEstamina() {
        return estamina;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void visualizarPersonagem()
    {
        System.out.println("\nVizualizar Personagem!\n");
        System.out.println("Nome: " + this.getNome());
        System.out.println("HP Total: " + this.getMaxHP());
        System.out.println("Forca: " + this.getForca());
        System.out.println("Destreza: " + this.getDestreza());
        System.out.println("Defesa: " + this.getDefesa());
        System.out.println("Especial: " + this.getEspecial());
        System.out.println("Estamina: " + this.getEstamina());
        System.out.println("\n");
    }
}
