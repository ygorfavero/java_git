public class DesafioMatematico {

    private String pergunta;
    private double respostaCorreta;
    private String nivelDificuldade; // Fácil, Médio, Difícil
    private int pontos;

    public DesafioMatematico() {
    }

    public DesafioMatematico(String pergunta, double respostaCorreta, String nivelDificuldade, int pontos) {
        this.pergunta = pergunta;
        this.respostaCorreta = respostaCorreta;
        this.nivelDificuldade = nivelDificuldade;
        this.pontos = pontos;
    }

    public void gerarDesafio() {
        System.out.println("Executando método gerarDesafio da classe DesafioMatematico");
    }

    public void corrigirResposta() {
        System.out.println("Executando método corrigirResposta da classe DesafioMatematico");
    }
}