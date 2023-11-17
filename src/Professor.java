import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String titulacao;
    private double salario;
    private List<Curso> cursos;

    public Professor() {
        this.cursos = new ArrayList<>();
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            curso.addProfessor(this);
        }
    }

    public void imprimir() {
        System.out.println("Professor:");
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);

        if (!cursos.isEmpty()) {
            System.out.println("Cursos: ");
            for (Curso curso : cursos) {
                System.out.println(curso.getNome());
            }
        }
    }
}