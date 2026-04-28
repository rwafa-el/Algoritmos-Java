public class Item {
    private int quantidade;
    private float valor;
    private String nome;

    public void setItemNome(String nome){
        this.nome = nome;
    }
    public void setItemQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setItemValor(float valor){
        this.valor = valor;
    }
    public String getItemNome(){
        return nome;
    }
    public float getItemValor(){
        return valor;
    }
    public int getItemQuantidade(){
        return quantidade;
    }
}
