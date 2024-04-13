public class Mago implements Classe {

    private int maxHP = 40;
    private int forca = 2;
    private int defesa = 2;
    private int destreza = 3;
    private int especial = 6;

    @Override
    public int[] ataque1(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Bola de Fogo";
        System.out.println("Lança uma bola de fogo!");

        int destrezaAtk = destreza + (int) (Math.random() * 8);
        int dmg = especial + (int) (Math.random() * 10) + 5;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public int[] ataque2(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Raio de Gelo";
        System.out.println("Dispara um raio de gelo!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = especial + (int) (Math.random() * 8) + 3;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public int[] ataque3(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Explosão Arcana";
        System.out.println("Causa uma explosão arcana!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = especial + (int) (Math.random() * 12) + 4;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public int[] ataque4(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Grande Feixe de Luz";
        System.out.println("Invoca um Grande Feixe de Luz!");

        int destrezaAtk = destreza + (int) (Math.random() * 10);
        int dmg = especial + (int) (Math.random() * 15) + 6;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public String getNomeAtaque(int tipoAtaque) {
        switch (tipoAtaque) {
            case 1:
                return "Bola de Fogo";
            case 2:
                return "Raio de Gelo";
            case 3:
                return "Explosão Arcana";
            case 4:
                return "Grande Feixe de Luz";
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

}

