package br.ufpb.dcx.aps.atividades.atv02;


import java.util.LinkedList;
import java.util.List;

public class Disciplina {

    private int codigoDisciplina;
    private Turma turma;
    private List<Turma> turmas = new LinkedList<Turma>();

    public Disciplina(int codigoDisciplina, Turma turma) {
        this.codigoDisciplina = codigoDisciplina;
        this.turma = turma;

    }

    public Disciplina(int CodigoDisciplina) {
        this.codigoDisciplina = CodigoDisciplina;
        

    }

    public Turma criarTurma(int codTurma) {
        if (codTurma > 0) {
            Turma turma1 = new Turma(codTurma);
            turmas.add(turma1);
            return turma1;
        } else {
            throw new RuntimeException("Código de turma inválido: -1");
        } 
        

    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public Turma getTurma(int codTurma) {
        for(Turma x : turmas){
            if(x.getCodigo() == codTurma){
                this.turma = x;
            } 
    } if(turmas.isEmpty()){
        turma = null;
    }
        return turma;
    }

    public List<Turma> getTurmas() {
        return this.turmas;
    }

}
