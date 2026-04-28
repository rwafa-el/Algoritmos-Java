import java.util.Random;

public class main2 {

    public static void main(String[] args) {
        Aluno Rafael;
        Rafael = new Aluno();
        Rafael.addNumNota(6);
        for(int i = 0; i<6; i++){
            Random gerador = new Random();
            int j = gerador.nextInt(11);
            Nota nota = new Nota();
            nota.setValor(i);
            Rafael.addNota(j, nota);
        }
        for(int i = 0; i<6; i++){
            System.out.println("Nota: " + Rafael.iesima(i));
        }

        System.out.printf("Media: %.2f\n", Rafael.getMedia());
    }
}
