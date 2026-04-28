public class Time {
    private Jogador jogadores[];

    public void defineJogadores(int n){
        jogadores = new Jogador[n];
    }

    public void defineQtd(int n, PosicaoTatica posicao){
        posicao.changeValor(n,posicao);
    }

    public int adicionarJogador(int n, Jogador player){

        PosicaoTatica posicao = player.getPosicao();

        if(posicao.getValor() == 0){
            System.out.println("O time não pode ter mais " + posicao);
            return 1;
        }
        jogadores[n] = player;
        posicao.decrementaValor(posicao);
        return 0;
    }

    public void printTime(Time time){
        for(int i = 0; i < 7; i++){
            System.out.println(time.jogadores[i].getNome());
            System.out.println(time.jogadores[i].getPosicao());
            System.out.printf("\n");
        }
    }
}
