public class Arqueiro implements Classe {

    private int maxHP = 50;
    private int forca = 3;
    private int defesa = 3;
    private int destreza = 6;
    private int especial = 4;
    private int estamina = 30;

    @Override
    public int[] ataque1(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Flecha Simples";
        System.out.println("Dispara uma flecha simples!");

        int destrezaAtk = destreza + (int) (Math.random() * 10);
        int dmg = forca + (int) (Math.random() * 8) + 2;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 3;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque2(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Flecha Perfurante";
        System.out.println("Dispara uma flecha perfurante!");

        int destrezaAtk = destreza + (int) (Math.random() * 12);
        int dmg = forca + (int) (Math.random() * 10) + 3;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 5;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque3(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Chuva de Flechas";
        System.out.println("Dispara uma chuva de flechas!");

        int destrezaAtk = destreza + (int) (Math.random() * 8);
        int dmg = forca + (int) (Math.random() * 8) + 4;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 7;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque4(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Tiro Certeiro";
        System.out.println("Faz um tiro certeiro, mirando pontos vitais!");

        int destrezaAtk = destreza + (int) (Math.random() * 10);
        int dmg = forca + (int) (Math.random() * 12) + 5;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 10;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public String getNomeAtaque(int tipoAtaque) {
        switch (tipoAtaque) {
            case 1:
                return "Flecha Simples";
            case 2:
                return "Flecha Perfurante";
            case 3:
                return "Chuva de Flechas";
            case 4:
                return "Tiro Certeiro";
            default:
                return "Ataque Desconhecido";
        }
    }

    @Override
    public int getMaxHP() {
        return maxHP;
    }

    @Override
    public int getEspecial() {
        return especial;
    }

    @Override
    public int getForca() {
        return forca;
    }

    @Override
    public int getDestreza() {
        return destreza;
    }

    @Override
    public int getDefesa() {
        return defesa;
    }

    @Override
    public int getEstamina() {
        return estamina;
    }

}

