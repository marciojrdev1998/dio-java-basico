package main.java.list.OperacoesBasicas.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // Atributo
    private Map<String, Integer> agendaContatoMap;

    // Construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public AgendaContatos(Map<String, Integer> agendaContatoMap) {
        if (agendaContatoMap != null) {
            this.agendaContatoMap = new HashMap<>(agendaContatoMap);
        } else {
            this.agendaContatoMap = new HashMap<>();
        }
    }

    // Método para adicionar um contato
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    // Método para remover um contato
    public void removerContato(String nome) {
        agendaContatoMap.remove(nome);
    }

    // Método para exibir todos os contatos
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    // Método para pesquisar um contato por nome
    public Integer pesquisarPorNome(String nome) {
        return agendaContatoMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionando contatos
        agendaContatos.adicionarContato("Camila", 123456789);
        agendaContatos.adicionarContato("João", 987654321);

        // Exibindo contatos
        agendaContatos.exibirContatos();

        // Pesquisando um contato por nome
        System.out.println("Telefone de Camila: " + agendaContatos.pesquisarPorNome("Camila"));

        // Removendo um contato
        agendaContatos.removerContato("João");
        agendaContatos.exibirContatos();
    }
}

