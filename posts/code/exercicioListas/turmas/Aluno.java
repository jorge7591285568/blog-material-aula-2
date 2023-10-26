import java.util.ArrayList;
import java.util.List;

public class Aluno{
    private String nome;
    private List<Turma> turmas;
    public Aluno(String nome, List<Turma> turmas) {
        this.nome = nome;
        this.turmas = (turmas == null) ? new ArrayList<>() : turmas;        
    }

    public Aluno(String nome) {
        this(nome, null);
    }

    public List<Turma> getTurmas(){
        return List.copyOf(turmas);
    }

    public void removeTurma(Turma turma) {
        if(turmas.contains(turma)){
            turmas.add(turma);
            turma.removeAluno(this);
        }
    }

    public void addTurma(Turma turma) {
        if(!turmas.contains(turma)){
            turmas.add(turma);
            turma.addAluno(this);
        }
    }    

    public String getNome() {
        return nome;
    }
    public String toString(){
        return getNome();
    }

}