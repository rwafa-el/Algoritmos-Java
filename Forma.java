public abstract class Forma{
    protected double perimetro;
    protected double area;
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();
    public void imprimirValores(){
        System.out.println("PERIMETRO: " + perimetro);
        System.out.println("AREA: " + area);
    }
    
}