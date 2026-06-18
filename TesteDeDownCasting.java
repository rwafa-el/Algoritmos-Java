import java.util.ArrayList;

public class TesteDeDownCasting{
    public static void main(String[] args){
        ArrayList<Forma> formas = new ArrayList<Forma>();
        TestaFormas.criaFormas(formas);
        for (Forma e : formas){
            if(e instanceof Elipse || e instanceof Circulo){
                Elipse elipse = (Elipse) e;
                elipse.imprimirAtributos();
            }
            if(e instanceof Quadrado || e instanceof Retangulo){
                Retangulo ret = (Retangulo) e;
                ret.imprimirAtributos();
            }
        }
    }
}