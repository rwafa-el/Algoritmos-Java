public class Main {
    public static void main(String[] args){
        Bicicleta c1 = new Bicicleta();
        c1.vmax(80);
        c1.acelerar(100);
        c1.mudarMarcha(10);
        c1.imprimirEstados();
        
        Bicicleta c2 = new Bicicleta();
        c2.vmax(100);
        c2.acelerar(80);
        c2.acelerar(30);
        c2.mudarMarcha(7);
        c2.imprimirEstados();
        
        c1.freiar(50);
        c1.imprimirEstados();
        
    }
}