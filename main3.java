import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Fatura f1 = new Fatura();
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        f1.setNome(scan.nextLine());

        System.out.println("Digite o seu CPF: ");
        f1.setCPF(scan.nextLine());

        for(int escolha = 1, i = 0; escolha == 1; i++){

            if(i == 11){
                System.out.println("Limite de itens alcançado.");
                break;
            }

            System.out.println("Digite o nome do item: ");
            Item i1 = new Item();
            i1.setItemNome(scan.nextLine());

            System.out.println("Digite a quantidade desse item: ");
            i1.setItemQuantidade(scan.nextInt());

            System.out.println("Digite o valor desse item: ");
            i1.setItemValor(scan.nextFloat());

            f1.faturaItem(i, i1);

            System.out.printf("Deseja adicionar outro item?\n\n1. Sim.\n2. Não.\n\n->");
            escolha = (scan.nextInt());
        }

        scan.close();
    }
}