public interface Raca {

     int maxHP = 0;
     int forca = 0;
     int destreza = 0;
     int defesa = 0;
     int especial = 0;
     int estamina = 0;

    default int getMaxHP()
    {
        return maxHP;
    }

   default int getEspecial() {
        return especial;
    }

   default int getForca() {
        return forca;
    }

   default int getDestreza() {
        return destreza;
    }

    default int getDefesa() {
        return defesa;
    }

    default int getEstamina() {
        return estamina;
    }
}
