import java.util.ArrayList;

public class Professor {
    private String titulacaoProfessor;
    private double salarioProfessor;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public String getTitulacaoProfessor() {
        return titulacaoProfessor;
    }

    public void setTitulacaoProfessor(String titulacaoProfessor) {
        this.titulacaoProfessor = titulacaoProfessor;
    }

    public double getSalarioProfessor() {
        return salarioProfessor;
    }

    public void setSalarioProfessor(double salarioProfessor) {
        this.salarioProfessor = salarioProfessor;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void addCurso(Curso curso){
        curso.addTitulacaoProfessor(this);
        cursos.add(curso);
    }

    public void imprimir(){
        System.out.println("Titulacao: "+getTitulacaoProfessor());
        System.out.println("Cursos associados aos professores");
        for(int i = 0; i < cursos.size();i++ ){
            System.out.println(" "+getTitulacaoProfessor().get(i).getSalarioProfessor());
        }
    }

}
