public class Freeza extends Personagem {
    private int nivelDeTransformacao;
    private String tipoDeTransformacao;


    public Freeza(String nomePersonagem, String racaPersonagem, int idadePersonagem, int nivelDeTransformacao, String tipoDeTransformacao) {
        super(nomePersonagem, racaPersonagem, idadePersonagem);
        setNivelDeTransformacao(nivelDeTransformacao);
        setTipoDeTransformacao(tipoDeTransformacao);
    }

    public int getNivelDeTransformacao() {
        return nivelDeTransformacao;
    }

    public void setNivelDeTransformacao(int nivelDeTransformacao) {
        this.nivelDeTransformacao = nivelDeTransformacao;
    }

    public String getTipoDeTransformacao() {
        return tipoDeTransformacao;
    }

    public void setTipoDeTransformacao(String tipoDeTransformacao) {
        this.tipoDeTransformacao = tipoDeTransformacao;
    }

    public void transformar() {
        System.out.println(getNomePersonagem() + " se transformou em: " + getTipoDeTransformacao());
    }

    public void transformar(int nivelDeTransformacao) {
        System.out.println(getNomePersonagem() + "esta se transformando para " + getTipoDeTransformacao() + "nivel: " + getNivelDeTransformacao() );
    }
}
