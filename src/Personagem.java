public class Personagem {
    private String nomePersonagem;
    private String racaPersonagem;
    private int idadePersonagem;


    public Personagem(String nomePersonagem, String racaPersonagem, int idadePersonagem) {
        setNomePersonagem(nomePersonagem);
        setRacaPersonagem(racaPersonagem);
        setIdadePersonagem(idadePersonagem);
    }

    public String getNomePersonagem() {
        return nomePersonagem;
    }

    public void setNomePersonagem(String nomePersonagem) {
        this.nomePersonagem = nomePersonagem;
    }

    public String getRacaPersonagem() {
        return racaPersonagem;
    }

    public void setRacaPersonagem(String racaPersonagem) {
        this.racaPersonagem = racaPersonagem;
    }

    public int getIdadePersonagem() {
        return idadePersonagem;
    }

    public void setIdadePersonagem(int idadePersonagem) {
        this.idadePersonagem = idadePersonagem;
    }

    public void mostrarDadosDoPersonagem() {
        System.out.println("Nome do Personagem:" + getNomePersonagem());
        System.out.println("Raça do personagem:" + getRacaPersonagem());
        System.out.println("Idade do Personagem:" + getIdadePersonagem());
    }

}
