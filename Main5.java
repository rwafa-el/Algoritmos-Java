public class Main5{
    public static void main(String[] args) {

        Aluno rafael;
        rafael = new Aluno();

        rafael.setCPF("204.977.157.67");
        rafael.setNome("Rafael");
        
        rafael.addNumNota(7);

        Nota nota = new Nota();
        nota.setValor(10);
        nota.setData("25/09");


        
        rafael.addNota(0, nota);
        
        rafael.addNota(1, nota);

        rafael.addNota(2, nota);

        rafael.addNota(3, nota);

        rafael.addNota(4, nota);

        rafael.addNota(5, nota);

        rafael.addNota(6, nota);

        System.out.println(rafael.getMedia());

    }
}