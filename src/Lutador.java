public class Lutador implements Classe {

    private int maxHP = 50;
    private int forca = 7;
    private int defesa = 3;
    private int destreza = 4;
    private int especial = 2;

    @Override
    public int[] ataque1(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Soco";
        System.out.println("Desfere um soco poderoso!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = forca + (int) (Math.random() * 8) + 2;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public int[] ataque2(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Chute";
        System.out.println("Executa um chute forte!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = forca + (int) (Math.random() * 10) + 3;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public int[] ataque3(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Agarrão";
        System.out.println("Tenta agarrar o oponente!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = forca + (int) (Math.random() * 8) + 2;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public int[] ataque4(int forca, int destreza, int defesa, int HP, int especial) {
        String nome = "Combo de Golpes";
        System.out.println("Desfere uma sequência rápida de golpes!");

        int destrezaAtk = destreza + (int) (Math.random() * 8);
        int dmg = forca + (int) (Math.random() * 15) + 5;

        int[] ataque = new int[2];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;

        return ataque;
    }

    @Override
    public String getNomeAtaque(int tipoAtaque) {
        switch (tipoAtaque) {
            case 1:
                return "Soco";
            case 2:
                return "Chute";
            case 3:
                return "Agarrão";
            case 4:
                return "Combo de Golpes";
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
