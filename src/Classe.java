public interface Classe {

     int[] ataque1(int forca, int destreza, int defesa, int HP, int especial, int estamina);
     int[] ataque2(int forca, int destreza, int defesa, int HP, int especial, int estamina);
     int[] ataque3(int forca, int destreza, int defesa, int HP, int especial, int estamina);
     int[] ataque4(int forca, int destreza, int defesa, int HP, int especial, int estamina);

    int getMaxHP();
    int getEspecial();
    int getForca();
    int getDestreza();
    int getDefesa();
    int getEstamina();
    String getNomeAtaque(int tipoAtaque);


}
