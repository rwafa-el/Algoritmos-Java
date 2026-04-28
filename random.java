import java.util.Random;

public class random {
    int min = 0;
    int max = 0;
    public static int getRandom (int min, int max){
        Random gerador = new Random();
        return gerador.nextInt((max-min) + 1) + min;
    }
}
