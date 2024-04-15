public class Samurai implements Classe {

    private int maxHP = 40;
    private int forca = 3;
    private int defesa = 3;
    private int destreza = 5;
    private int especial = 3;
    private int estamina = 30;

    @Override
    public int[] ataque1(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Corte Rápido";
        System.out.println("Desfere um rápido golpe com sua katana!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = forca + (int) (Math.random() * 10) + 3;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 3;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque2(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Corte Poderoso";
        System.out.println("Executa um golpe poderoso com sua katana!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = forca + (int) (Math.random() * 12) + 5;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 5;
        ataque[2] = estaminaGasta;
        return ataque;
    }

    @Override
    public int[] ataque3(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Investida";
        System.out.println("Realiza uma investida rápida com sua katana!");

        int destrezaAtk = destreza + (int) (Math.random() * 6);
        int dmg = forca + (int) (Math.random() * 10) + 3;

        int[] ataque = new int[3];
        ataque[0] = destrezaAtk;
        ataque[1] = dmg;
        int estaminaGasta = 7;
        ataque[2] = estaminaGasta;

        return ataque;
    }

    @Override
    public int[] ataque4(int forca, int destreza, int defesa, int HP, int especial, int estamina) {
        String nome = "Fúria do Samurai";
        System.out.println("Desfere uma série de golpes rápidos e poderosos!");

        int destrezaAtk = destreza + (int) (Math.random() * 8);
        int dmg = forca + (int) (Math.random() * 15) + 7;

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
                return "Corte Rápido";
            case 2:
                return "Corte Poderoso";
            case 3:
                return "Investida";
            case 4:
                return "Fúria do Samurai";
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
