package br.ufpb.dcx.aps.atividades.atv02;

public class Aluno {

    private int matricula;
    private String nome;

    public Aluno(){
        this.matricula = 0;
        this.nome = "";
    }

    public Aluno (int matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula(){
        return this.matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    
    
}
