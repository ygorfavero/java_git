import java.util.Date;

public class Transacao {

    private String tipo; // Ex: ganho de moedas, resgate de prêmio
    private double valor;
    private Date data;

    public Transacao() {
    }

    public Transacao(String tipo, double valor, Date data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public void registrarTransacao() {
        System.out.println("Executando método registrarTransacao da classe Transacao");
    }
}