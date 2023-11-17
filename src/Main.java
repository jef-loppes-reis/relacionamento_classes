public class Main {
    /**
     * @param args
     */
    public static void Main(String[] args) {
        Telefone telefone1 = new Telefone();
        telefone1.setTipo("Celular");
        telefone1.setDdd("061");
        telefone1.setNumero("982478632");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Residencial");
        telefone2.setDdd("062");
        telefone2.setNumero("33827392");

        Endereco endereco = new Endereco();
        endereco.setRua("QNM 20");
        endereco.setCidade("Ceilandia Norte");
        endereco.setEstado("Brasilia");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jeferson");
        pessoa.setCpf("123.456.789-00");
        pessoa.setEmail("jeferson@example.com");
        pessoa.addTelefone(telefone1);
        pessoa.addTelefone(telefone2);
        pessoa.setEndereco(endereco);

        Curso curso = new Curso("Analise de Dados");

        Professor professor = new Professor();
        professor.setTitulacao("Doutorado");
        professor.setSalario(10000.0);
        professor.addCurso(curso);

        Aluno aluno = new Aluno();
        aluno.setCurso(curso);

        pessoa.imprimir();
        System.out.println();

        curso.imprimirCurso();
        System.out.println();

        professor.imprimir();
        System.out.println();

        aluno.imprimir();
    }
}