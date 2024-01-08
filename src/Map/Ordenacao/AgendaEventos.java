package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributos
    private Map <LocalDate, Evento> eventosMap;

    //Construtor
    public AgendaEventos () {
        this.eventosMap = new HashMap<>();
    }

    //Adicionar evento à agenda
    public void adicionarEvento (LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    //Exibir a agenda cadastrada
    public void exibirAgenda () {
        //Organizando o Map em ordem crescente
        Map <LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }

    //Obter próximos eventos
    public void obterProximoEvento () {
        //Criando variável para pegar data atual
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        
        //Criando lógica de análise
        if (!eventosMap.isEmpty()) {
            //Organizando em ordem crescente o Map
            Map <LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
            for (Map.Entry <LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O próximo evento: " + proximoEvento + " ocontecerá na data " + proximaData);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        //Instanciando o objeto para manipulação
        AgendaEventos agenda = new AgendaEventos();

        // Adicionando evento a agenda
        agenda.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2022,7, 9), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2020, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2024, 1, 8), "Evento 4", "Atração 4");
        agenda.adicionarEvento(LocalDate.of(2024, 1, 12), "Evento 5", "Atração 5");
        agenda.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        //Exibindo agenda
        agenda.exibirAgenda();

        //Obter próximo evento
        agenda.obterProximoEvento();
    }
}
