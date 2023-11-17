public class Aluno {
    private double notas;
    private Curso curso;

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public double getNotas() {
        return notas;
    }

    public void imprimir() {
        System.out.println("Aluno: ");
        System.out.println("Notas: " + notas);
        if (curso != null) {
            System.out.println("Curso: " + curso.getNome());
        } else {
            System.out.println("Curso: -");
        }
    }
}