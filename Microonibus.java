public class Microonibus {
    private int lotacao;
    private int lotacaomax;
    private float pesomax;
    private Pessoa [] passageiro;

    public void setLotacao(int lotacao){
        this.lotacao = lotacao;
        this.lotacaomax = lotacao;
        passageiro = new Pessoa[lotacao];
    }
    public int getLotacao(){
        return lotacao;
    }

    public void setPeso(float pesomax){
        this.pesomax = pesomax;
    }
    public float getPeso(){
        return pesomax;
    }

    public void addPassageiro(Pessoa pessoa){
        if(lotacao <= 0){
            System.out.println("Limite máximo de passageiros atingido!");
        }
        else if(pesomax==0){
            System.out.println("Limite de peso atingido!");
        }
        else if(pesomax - pessoa.getPeso() < 0){
            System.out.println("Pessoa pesada demais, emagreça!");
        }

        else if(lotacao>0 && pesomax>0){
            this.lotacao -= 1;
            this.pesomax = pesomax - pessoa.getPeso();
            passageiro[lotacao] = pessoa;
        }

    }

    public void printPassageiro(){
        for(int i = lotacaomax - 1; i>0; i--){
            System.out.println(passageiro[i].getNome());
            System.out.println(passageiro[i].getPeso());
            System.out.printf("\n");
        }
    }
}
