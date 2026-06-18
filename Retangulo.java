public class Retangulo extends Forma{
    protected double altura;
    protected double largura;
    
    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public void calcularArea(){
        area = altura * largura;
    }
    public void calcularPerimetro(){
        perimetro = (2*altura) + (2*largura);
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public void imprimirAtributos(){
        if(altura != largura){
            System.out.println("ALTURA: " + altura);
            System.out.println("LARGURA: " + largura);
            System.out.println(" ");
        }
        else{
            System.out.println("LADO: " + altura);
            System.out.println(" ");
        }
    }
    
}