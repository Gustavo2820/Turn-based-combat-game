public class Elfo implements Raca {

    private int maxHP = 40;
    private int forca = 3;
    private int destreza = 5;
    private int defesa = 3;
    private int estamina = 35;
    private int especial = 4;

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
