import java.util.Scanner;

public class mainjogo {

    public static void main(String[] args){

        LimparTela.limparConsole();

        Scanner scan = new Scanner (System.in);

        Time rafalovers = new Time();

        rafalovers.defineQtd(1,PosicaoTatica.GOLEIRO);
        rafalovers.defineQtd(2,PosicaoTatica.ZAGUEIRO);
        rafalovers.defineQtd(2,PosicaoTatica.LATERAL);
        rafalovers.defineQtd(1,PosicaoTatica.MEIA);
        rafalovers.defineQtd(1,PosicaoTatica.ATACANTE);

        rafalovers.defineJogadores(7);

        for(int i = 0; i < 7; i++){
            Jogador jogador = new Jogador();
            System.out.println("Digite o nome do jogador " + (i+1) + ": ");
            jogador.setNome(scan.nextLine());
            System.out.println("Digite a posição do jogador " + (i+1) + ": ");
            String p = ((scan.nextLine()));
            p = p.toUpperCase();
            while(!p.equals("GOLEIRO") && !p.equals("ZAGUEIRO") && !p.equals("LATERAL") && !p.equals("MEIA") && !p.equals("ATACANTE")){
                System.out.println("Digite uma posição válida: ");
                p = ((scan.nextLine()));
                p = p.toUpperCase();
            }

            jogador.setPosicao(PosicaoTatica.valueOf(p));


            if(rafalovers.adicionarJogador(i, jogador) == 1){
                System.out.println("Limite de posição alcançado.");
                scan.nextLine();
                i--;
            }

            System.out.printf("\n");
            LimparTela.limparConsole();
        }

        scan.close();

        rafalovers.printTime(rafalovers);

    }
}