import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
            professor.addCurso(this);
        }
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.setCurso(this);
    }

    public void imprimirCurso() {
        System.out.println("Curso: " + nome);

        if (!professores.isEmpty()) {
            System.out.println("Professores: ");
            for (Professor professor : professores) {
                System.out.println(professor.getTitulacao() + " " + professor.getSalario());
            }
        }
    }
}