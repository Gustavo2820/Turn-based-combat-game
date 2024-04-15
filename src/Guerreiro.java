public class Guerreiro implements Classe {

    private final int maxHP = 50;
    private final int forca = 4;
    private final int defesa = 4;
    private final int destreza = 3;
    private final int especial = 2;
    private final int estamina = 40;

    @Override
    public int[] ataque1(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "atkBasico";
        System.out.println("Ataca com sua arma!");

        int destrezaAtk = destreza + (int) (Math.random() * 10);
        int dmg = forca + (int) (Math.random() * 10);

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 3;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque2(int forca, int destreza, int defesa, int HP, int especial, int estamina) {

        String nome = "atkPesado";
        System.out.println("Faz um golpe pesado com sua arma!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
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
        String nome = "atkRápido";
        System.out.println("Realiza uma série rápida de golpes!");

        int destrezaAtk = destreza + (int) (Math.random() * 8);
        int dmg = forca + (int) (Math.random() * 8);

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 7;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque4(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "atkEspecial";
        System.out.println("Executa um ataque especial!");

        int destrezaAtk = destreza + (int) (Math.random() * 12);
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
                return "Ataque Básico";
            case 2:
                return "Ataque Pesado";
            case 3:
                return "Ataque Rápido";
            case 4:
                return "Ataque Especial";
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
