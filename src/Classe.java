public interface Classe {

     int[] ataque1(int forca, int destreza, int defesa, int HP, int especial);
     int[] ataque2(int forca, int destreza, int defesa, int HP, int especial);
     int[] ataque3(int forca, int destreza, int defesa, int HP, int especial);
     int[] ataque4(int forca, int destreza, int defesa, int HP, int especial);

    int getMaxHP();
    int getEspecial();
    int getForca();
    int getDestreza();
    int getDefesa();
    String getNomeAtaque(int tipoAtaque);

}
