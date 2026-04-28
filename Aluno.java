public class Aluno extends Pessoa {
    
    private Nota [] notas;

    public Nota iesima(int i){
        return notas[i];
    }

    public void addNumNota(int n){
        notas = new Nota[n];
    }

    public void addNota(int n, Nota m){
        this.notas[n] = m;
    }

    public float getMedia() {
        float m = 0;
        for(int i = 0; i<notas.length; i++){
            m += notas[i].getValor();
        }
        m = m/notas.length;
        return m;
    }
}