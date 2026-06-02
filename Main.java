import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Double> amostras = new ArrayList<Double>();
        System.out.println("Digite um número de amostras:");
        int a = scan.nextInt();
        
        for(int i = 0; i < a; i++){
            double b = rand.nextDouble(50);
            amostras.add(b);
        }
        
        double soma = 0;
        for(int i = 0; i < amostras.size(); i++){
            soma = soma + amostras.get(i);
        }
        double media = soma/amostras.size();
        System.out.println("Média: " + media);
    
        
    
        double desvio = 0;
        for(int i = 0; i < amostras.size(); i++){
            desvio = desvio + Math.pow((amostras.get(i) - media),2);
        }
        desvio = Math.sqrt(desvio/amostras.size());
        
        System.out.println("Desvio: " + desvio);
        
    }
}