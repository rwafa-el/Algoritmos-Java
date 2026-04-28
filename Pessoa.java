public class Pessoa {
    private String nome, pai, mae;
    private int dia, mes, ano;
    private String CPF;
    private String nacionalidade;
    private String sexo, estadocivil;
    private float altura, peso;


    public void setCPF (String cpf){
        this.CPF = cpf;
    }

    public String getCPF (){
        return CPF;
    }
    //nome
    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    //pai e mae
    public void setMae (String mae){
        this.mae = mae;
    }

    public String getMae (){
        return mae;
    }
    public void setPai (String pai){
        this.pai = pai;
    }

    public String getPai (){
        return pai;
    }

    //dia, mes e nascimento
    public void setData (int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia (){
        return dia;
    }
    public int getMes (){
        return mes;
    }
    public int getAno (){
        return ano;
    }

    public void getData (){
        System.out.printf("\n%d/%d/%d\n", dia, mes, ano);
    }

    //nacionalidade, sexo, estadocivil
    public void setNacionalidade (String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade (){
        return nacionalidade;
    }
    public void setSexo (String sexo){
        this.sexo = sexo;
    }

    public String getSexo (){
        return sexo;
    }
    public void setEstado (String estadocivil){
        this.estadocivil = estadocivil;
    }

    public String getEstado (){
        return estadocivil;
    }

    //altura e peso
    public void setAltura (float altura){
        this.altura = altura;
    }

    public float getAltura (){
        return altura;
    }
    public void setPeso (float peso){
        this.peso = peso;
    }

    public float getPeso (){
        return peso;
    }
}
