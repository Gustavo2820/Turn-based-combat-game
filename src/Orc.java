public class Orc implements Raca {

    private int maxHP = 60;
    private int forca = 5;
    private int destreza = 3;
    private int defesa = 5;
    private int estamina = 50;

    @Override
    public int getMaxHP() {
        return maxHP;
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

