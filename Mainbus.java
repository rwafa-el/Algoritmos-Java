import java.util.Scanner;

public class Mainbus {
    public static void main (String args []){

        LimparTela.limparConsole();

        Scanner scan = new Scanner(System.in);

        Microonibus buzinho = new Microonibus();
        buzinho.setLotacao(6);
        buzinho.setPeso(500);

        for(int i = 0; i < 6; i++){
            Pessoa pessoa = new Pessoa();

            System.out.println("Digite o nome do passageiro " + (i+1) + ": ");
            pessoa.setNome(scan.next());

            System.out.println("Digite o peso dele: ");
            pessoa.setPeso(scan.nextFloat());

            System.out.printf("\n");
            buzinho.addPassageiro(pessoa);
        }

        buzinho.printPassageiro();
        scan.close();
    }
}
