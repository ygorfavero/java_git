public class Usuario {

    private String nome;
    private int idade;
    private String email;
    private double saldoVirtual;
    private int pontuacao;

    public Usuario() {
    }

    public Usuario(String nome, int idade, String email, double saldoVirtual, int pontuacao) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.saldoVirtual = saldoVirtual;
        this.pontuacao = pontuacao;
    }

    public void cadastrarUsuario() {
        System.out.println("Executando método cadastrarUsuario da classe Usuario");
    }

    public void visualizarPerfil() {
        System.out.println("Executando método visualizarPerfil da classe Usuario");

      }

    public void visualizarPerfil2() {
        System.out.println("Executando método visualizarPerfil da classe Usuario");
    }
}