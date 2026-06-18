import java.util.Random;
import java.util.ArrayList;

public class TestaFormas{
    
    public static ArrayList<Forma> criaFormas(ArrayList formas){
        
        Random rand = new Random();
        int a = rand.nextInt(10) + 1;
        
        for(int i = 0; i<a; i++){
            double x = rand.nextDouble(100) + 1;
            double y = rand.nextDouble(100) + 1;
            int b = rand.nextInt(4) + 1;
            switch(b){
                case 1: 
                    Retangulo c = new Retangulo(x,y);
                    formas.add(c);
                    break;
                case 2:
                    Quadrado d = new Quadrado(x);
                    formas.add(d);
                    break;
                case 3:
                    Elipse e = new Elipse(x,y);
                    formas.add(e);
                    break;
                case 4:
                    Circulo f = new Circulo(x);
                    formas.add(f);
                    break;
            }
        }
        return formas;
    }
}