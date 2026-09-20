public class Desenho {
    private String nomeDesenho;
    private String anoLancamento;
    private String autorDesenho;


    public Desenho(String nomeDesenho, String anoLancamento, String autorDesenho) {
        setNomeDesenho(nomeDesenho);
        setAnoLancamento(anoLancamento);
        this.autorDesenho = autorDesenho;
    }

    public String getNomeDesenho() {
        return nomeDesenho;
    }

    public void setNomeDesenho(String nomeDesenho) {
        this.nomeDesenho = nomeDesenho;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAutorDesenho() {
        return autorDesenho;
    }

    public void setAutorDesenho(String autorDesenho) {
        this.autorDesenho = autorDesenho;
    }

    public void mostrarDados() {
        System.out.println("Nome do desenho:" + getNomeDesenho());
        System.out.println("Ano de lançamento:" + getAnoLancamento());
        System.out.println("Autor do Desenho:" + getAutorDesenho());
    }
    }



