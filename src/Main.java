public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema X.Number iniciado");

        Usuario usuario = new Usuario();
        usuario.cadastrarUsuario();

        Responsavel responsavel = new Responsavel();
        responsavel.autorizarCadastro();

        Conta conta = new Conta();
        conta.consultarSaldo();

        DesafioMatematico desafio = new DesafioMatematico();
        desafio.gerarDesafio();

        Transacao transacao = new Transacao();
        transacao.registrarTransacao();
    }

}