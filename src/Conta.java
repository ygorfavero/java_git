 public class Conta {

    private String numeroConta;
    private double saldo;
    private String tipoConta; // Ex: Conta Educacional

    public Conta() {
    }

    public Conta(String numeroConta, double saldo, String tipoConta) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void consultarSaldo() {
        System.out.println("Executando método consultarSaldo da classe Conta");
    }

    public void atualizarSaldo() {  System.out.println("Executando método atualizarSaldo da classe Conta"); }

}
