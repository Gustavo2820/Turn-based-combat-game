public class Elfo implements Raca {

    private int maxHP = 40;
    private int forca = 3;
    private int destreza = 5;
    private int defesa = 3;

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
}
