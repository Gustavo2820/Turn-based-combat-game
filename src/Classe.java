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

    static void visualizarClasse(int escolha) {

        Guerreiro guerreiro = new Guerreiro();
        Mago mago = new Mago();
        Samurai samurai = new Samurai();
        Lutador lutador = new Lutador();
        Arqueiro arqueiro = new Arqueiro();

        switch (escolha) {
            case 1:
                System.out.println("\nVizualizar Classe de Guerreiro!");
                System.out.println("HP Total: " + guerreiro.getMaxHP());
                System.out.println("Forca: " + guerreiro.getForca());
                System.out.println("Destreza: " + guerreiro.getDestreza());
                System.out.println("Defesa: " + guerreiro.getDefesa());
                System.out.println("Especial: " + guerreiro.getEspecial());
                System.out.println("Estamina: " + guerreiro.getEstamina());
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\nVizualizar Classe de Mago!");
                System.out.println("HP Total: " + mago.getMaxHP());
                System.out.println("Forca: " + mago.getForca());
                System.out.println("Destreza: " + mago.getDestreza());
                System.out.println("Defesa: " + mago.getDefesa());
                System.out.println("Especial: " + mago.getEspecial());
                System.out.println("Estamina: " + mago.getEstamina());
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\nVizualizar Classe de Samurai!");
                System.out.println("HP Total: " + samurai.getMaxHP());
                System.out.println("Forca: " + samurai.getForca());
                System.out.println("Destreza: " + samurai.getDestreza());
                System.out.println("Defesa: " + samurai.getDefesa());
                System.out.println("Especial: " + samurai.getEspecial());
                System.out.println("Estamina: " + samurai.getEstamina());
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\nVizualizar Classe de Lutador!");
                System.out.println("HP Total: " + lutador.getMaxHP());
                System.out.println("Forca: " + lutador.getForca());
                System.out.println("Destreza: " + lutador.getDestreza());
                System.out.println("Defesa: " + lutador.getDefesa());
                System.out.println("Especial: " + lutador.getEspecial());
                System.out.println("Estamina: " + lutador.getEstamina());
                System.out.println("\n");
                break;
            case 5:
                System.out.println("\nVizualizar Classe de Arqueiro!");
                System.out.println("HP Total: " + arqueiro.getMaxHP());
                System.out.println("Forca: " + arqueiro.getForca());
                System.out.println("Destreza: " + arqueiro.getDestreza());
                System.out.println("Defesa: " + arqueiro.getDefesa());
                System.out.println("Especial: " + arqueiro.getEspecial());
                System.out.println("Estamina: " + arqueiro.getEstamina());
                System.out.println("\n");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
