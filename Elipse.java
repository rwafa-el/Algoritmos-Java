import java.lang.Math;

public class Elipse extends Forma implements Excentricidade{
    protected double excentricidade;
    protected double eixoa;
    protected double eixob;
    
    public Elipse(double eixoa, double eixob){
        this.eixoa = eixoa;
        this.eixob = eixob;
    }
    
    public void calcularPerimetro(){
        double a = Math.pow(eixoa,2);
        double b = Math.pow(eixob,2);
        perimetro = Math.PI * (Math.sqrt(2*(a + b) - Math.pow(eixoa - eixob,2)/2));
    }
    
    public void calcularArea(){
        area = Math.PI * eixoa * eixob;
    }
    
    public void calcularExcentricidade(){
        excentricidade = Math.sqrt(1-(Math.pow(eixob,2))/Math.pow(eixoa,2));
    }
    
    public void imprimirAtributos(){
        if(eixoa != eixob){
            System.out.println("EIXOA: " + eixoa);
            System.out.println("EIXOB: " + eixob);
            System.out.println(" ");
        }
        else{
            System.out.println("EIXO: " + eixoa);
            System.out.println(" ");
        }
    }
}