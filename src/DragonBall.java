public class DragonBall extends Desenho{
    private String saga;
    private String arco;
    private int episodio;

    public DragonBall(String nomeDesenho, String anoLancamento, String autorDesenho, String saga, String arco, int episodio) {
        super(nomeDesenho, anoLancamento, autorDesenho);
        setSaga(saga);
        setArco(arco);
        setEpisodio(episodio);
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Saga: " + getSaga());
        System.out.println("Arco: " + getArco());
        System.out.println("Episódio: " + getEpisodio());
    }
}
