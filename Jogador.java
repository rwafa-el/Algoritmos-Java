enum PosicaoTatica{
    GOLEIRO(0), ZAGUEIRO(0), LATERAL(0), MEIA(0), ATACANTE(0);
    private int valor;
    PosicaoTatica(int valor){
        this.valor = valor;
    }

    public void changeValor(int valor, PosicaoTatica posicao){
        posicao.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public void decrementaValor(PosicaoTatica posicao){
        posicao.valor--;
    }

};

public class Jogador {
    private PosicaoTatica posicao;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPosicao(PosicaoTatica posicao){
        this.posicao = posicao;
    }

    public PosicaoTatica getPosicao(){
        return posicao;
    }

}
