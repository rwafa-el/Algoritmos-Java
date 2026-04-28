public class Fatura{
    private String CPF;
    private Item [] itens;
    private String nome;

    
    public void faturaItem(int posicao, Item item){
        itens[posicao] = item;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void getCPF(){
        System.out.println("CPF: " + CPF);
    }
    public void getNome(){
        System.out.println("Nome: " + nome);
    }


    public void valorfatura(){
        double total = 0;

        System.out.println("Nome: " + nome);

        System.out.println("Dono do CPF: " + CPF);

        for(int i = 0; i < itens.length; i++){
            System.out.println("Nome do Item " + i + ": " + itens[i].getItemNome());
            System.out.println("Quantidade: " + itens[i].getItemQuantidade());
        }



        for(int i = 0; i < itens.length; i++){
            total += itens[i].getItemValor();
        }
        System.out.println("Valor total da fatura: " + total);
    }
}