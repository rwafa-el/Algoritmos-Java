

public class Bicicleta {
    public int marcha;
    public int velocidade;
    public int vmax;
    
    public void vmax(int maximo){
        this.vmax = maximo;
    }
    
    public void acelerar(int incremento){
        velocidade += incremento;
        if (velocidade > vmax){
            velocidade = vmax;
        }
    }
    
    public void freiar(int decremento){
        velocidade -= decremento;
    }
    
    public void mudarMarcha(int valor){
        marcha = valor;
    }
    
    public void imprimirEstados(){
        System.out.println("Marcha = " + this.marcha);
        System.out.println("Velocidade = " + this.velocidade);
        System.out.println("Velocidade Máxima = " + this.vmax);
    }
}