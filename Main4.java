public class Main4 {
    public static void main(String[] args) {
        Pessoa rafael = new Pessoa();
        rafael.setNome("Rafael");
        System.out.println(rafael.getNome());
        rafael.setMae("Francine");
        System.out.println(rafael.getMae());
        rafael.setPai("André");
        System.out.println(rafael.getPai()); 
        rafael.setData(5, 9, 2005);
        rafael.getData();
    }
}
