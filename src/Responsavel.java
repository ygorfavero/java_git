public class Responsavel {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public Responsavel() {
    }

    public Responsavel(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public void autorizarCadastro() {
        System.out.println("Executando método autorizarCadastro da classe Responsavel");
    }

    public void acompanharDesempenho() {
        System.out.println("Executando método acompanharDesempenho da classe Responsavel");
    }
}
