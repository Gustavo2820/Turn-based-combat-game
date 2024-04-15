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

    static void visualizarRaca(int escolha)
    {

        Humano humano = new Humano();
        Orc orc = new Orc();
        Elfo elfo = new Elfo();
        Anao anao = new Anao();

        switch (escolha) {
            case 1:
                System.out.println("\nVizualizar Raça de Humano!");
                System.out.println("HP Total: " + humano.getMaxHP());
                System.out.println("Forca: " + humano.getForca());
                System.out.println("Destreza: " + humano.getDestreza());
                System.out.println("Defesa: " + humano.getDefesa());
                System.out.println("Especial: " + humano.getEspecial());
                System.out.println("Estamina: " + humano.getEstamina());
                System.out.println("\n");
                break;
            case 2:
                System.out.println("\nVizualizar Raça de Orc!");
                System.out.println("HP Total: " + orc.getMaxHP());
                System.out.println("Forca: " + orc.getForca());
                System.out.println("Destreza: " + orc.getDestreza());
                System.out.println("Defesa: " + orc.getDefesa());
                System.out.println("Especial: " + orc.getEspecial());
                System.out.println("Estamina: " + orc.getEstamina());
                System.out.println("\n");
                break;
            case 3:
                System.out.println("\nVizualizar Raça de Elfo!");
                System.out.println("HP Total: " + elfo.getMaxHP());
                System.out.println("Forca: " + elfo.getForca());
                System.out.println("Destreza: " + elfo.getDestreza());
                System.out.println("Defesa: " + elfo.getDefesa());
                System.out.println("Especial: " + elfo.getEspecial());
                System.out.println("Estamina: " + elfo.getEstamina());
                System.out.println("\n");
                break;
            case 4:
                System.out.println("\nVizualizar Raça de Anão!");
                System.out.println("HP Total: " + anao.getMaxHP());
                System.out.println("Forca: " + anao.getForca());
                System.out.println("Destreza: " + anao.getDestreza());
                System.out.println("Defesa: " + anao.getDefesa());
                System.out.println("Especial: " + anao.getEspecial());
                System.out.println("Estamina: " + anao.getEstamina());
                System.out.println("\n");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
