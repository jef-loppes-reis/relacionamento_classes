import java.util.ArrayList;

public class Pessoa {

    private String nomePessoa;
    private String cpfPessoa;
    private String emailPessoa;
    private ArrayList<Telefone> telefones;
    private ArrayList<Endereco> enderecos;

    public getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa() {
        this.nomePessoa = nomePessoa;
    }

    public getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa() {
        this.cpfPessoa = cpfPessoa;
    }

    public getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa() {
        this.emailPessoa = emailPessoa;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public ArrayList<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(ArrayList<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + getNomePessoa());
        System.out.println("Telefones:");
        for (int i = 0; i < getTelefones().size(); i++) {
            System.out.println(getTelefones().get(i).getNumeroTel());
        }
    }

}
