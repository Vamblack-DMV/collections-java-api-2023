package Set.Pesquisa;

public class Tarefa {
    //Atributo
    private String descricao;
    private boolean concluida;

    //Constutor
    public Tarefa (String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    //Recebendo os valores das variáveis
    public String getDescricao() { return descricao; }
    public boolean isConcluida () { return concluida; }

    //Mudando o valor da variável
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setConcluida(boolean concluida) { this.concluida = concluida; }
    
    //Formatando a impressão
    @Override
    public String toString() {
        return "\nTarefa: " + descricao + " / Concluída: " + concluida;
    }
}
