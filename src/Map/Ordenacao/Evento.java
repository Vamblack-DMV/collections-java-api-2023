package Map.Ordenacao;

public class Evento {
    //Atributos
    private String nome;
    private String atracao;

    //Construtor
    public Evento (String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    //Recebendo o valor das variáveis
    public String getNome() { return nome; }
    public String getAtracao() { return atracao; }

    //Formatando a impressão
    @Override
    public String toString() {
        return "Evento: " + nome + " / Atração: " + atracao + "\n";
    }
}
