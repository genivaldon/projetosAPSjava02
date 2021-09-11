package br.ufpb.dcx.aps.atividades.atv02;

import java.util.LinkedList;
import java.util.List;

public class Turma {

     
    private int codigo;
    private Professor professor;
    private List<Aluno> alunos = new LinkedList<Aluno>();

    public Turma() {
        this.codigo = 0;

    }

    public Turma(int codTurma) {
        this.codigo = codTurma;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public Aluno getAluno(int matricula) {
        Aluno aluno1 = new Aluno();
        if (alunos .isEmpty()){
            aluno1 = null;
        } 
        for (Aluno aluno : alunos){
            if (matricula  == aluno.getMatricula()){
                aluno1 = aluno;
            }else {
                aluno1 = null;
            } 
}
        return aluno1;

    }

    public List<Aluno> getAlunos() {
        return this.alunos;

    }

    public int getCodigo() {
        return this.codigo;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno); 
            
    }

}


