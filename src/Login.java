public class Login {

    private String username;
    private String password;

    // Construtor padrão
    public Login() {
    }

    // Construtor com parâmetros
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Método para realizar login
    public void realizarLogin() {
        System.out.println("Executando método realizarLogin da classe Login");
    }

    // Método para validar usuário
    public void validarUsuario() {
        System.out.println("Executando método validarUsuario da classe Login");
    }

    // Método para logout
    public void logout() {
        System.out.println("Executando método logout da classe Login");
    }
}
