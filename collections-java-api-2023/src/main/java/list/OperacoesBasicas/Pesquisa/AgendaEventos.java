package main.java.list.OperacoesBasicas.map;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new TreeMap<>();
    }

    // Método para adicionar um evento à agenda
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        agenda.put(data, evento);
    }

    // Método para exibir a agenda de eventos em ordem crescente de data
    public void exibirAgenda() {
        for (Map.Entry<LocalDate, Evento> entry : agenda.entrySet()) {
            LocalDate data = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + data + ", " + evento);
        }
    }

    // Método para obter o próximo evento que ocorrerá
    public Evento obterProximoEvento() {
        return agenda.entrySet().stream()
                .filter(entry -> !entry.getKey().isBefore(LocalDate.now()))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adicionando eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 10), "Festival de Música", "Banda XYZ");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 7, 5), "Feira de Tecnologia", "Empresa ABC");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 20), "Exposição de Arte", "Artista DEF");

        // Exibindo a agenda de eventos
        System.out.println("Agenda de Eventos:");
        agendaEventos.exibirAgenda();

        // Obtendo o próximo evento que ocorrerá
        Evento proximoEvento = agendaEventos.obterProximoEvento();
        System.out.println("Próximo Evento: " + proximoEvento);
    }
}

