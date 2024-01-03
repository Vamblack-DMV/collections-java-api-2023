package Set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    
    //Atributo
    private String nome;
    private int codigoConvite;

    //Construtor
    public Convidado (String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //Recebendo o valor das variáveis
    public String getNome() { return nome; }
    public int getCodigoConvite() { return codigoConvite; }

    //Formatando para impressão
    @Override
    public String toString() {
        return "\nCógido do Convite: " + codigoConvite + ", Nome: " + nome;
    }

    //Metódo para comparação única
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    public int hashCode () {
        return Objects.hash(getCodigoConvite());
    }
}
