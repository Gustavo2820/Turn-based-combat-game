public interface Raca {

     int maxHP = 0;
     int forca = 0;
     int destreza = 0;
     int defesa = 0;
     int especial = 0;

    public default int getMaxHP()
    {
        return maxHP;
    }

    public default int getEspecial() {
        return especial;
    }

    public default int getForca() {
        return forca;
    }

    public default int getDestreza() {
        return destreza;
    }

    public default int getDefesa() {
        return defesa;
    }
}
