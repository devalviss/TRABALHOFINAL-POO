package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Medico extends Usuario {
    private String especialidade;
    private List<String> planosAtendidos;
    private double valorBaseParticular;
    private List<Avaliacao> avaliacoes;

    public Medico(String nome, String login, String senha, String especialidade, double valorBaseParticular) {
        super(nome, login, senha, "MEDICO");
        this.especialidade = especialidade;
        this.valorBaseParticular = valorBaseParticular;
        this.planosAtendidos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public String getEspecialidade() { return especialidade; }
    public List<String> getPlanosAtendidos() { return planosAtendidos; }
    public List<Avaliacao> getAvaliacoes() { return avaliacoes; }
    
    public void adicionarPlano(String plano) { this.planosAtendidos.add(plano.toLowerCase()); }
    public void adicionarAvaliacao(Avaliacao avaliacao) { this.avaliacoes.add(avaliacao); }

    // CALCULA A MPEDIA DE ESTRELAS PARA EXIBIR NA PESQUISA
    public double getMediaEstrelas() {
        if (avaliacoes.isEmpty()) return 0.0;
        double soma = 0;
        for (Avaliacao av : avaliacoes) {
            soma += av.getEstrelas();
        }
        return soma / avaliacoes.size();
    }

    // --- MÉTODOS POLIMÓRFICOS ---
    
    public double getValorConsulta() {
        return this.valorBaseParticular; // COMPORTAMENTO PADRÃO
    }

    public int getLimitePacientesDiarios() {
        return 3; // LIMITE EXIGIDO PELO SISTEMA
    }
    
    public boolean aceitaPlanoEspecifico(String plano) {
        return planosAtendidos.contains(plano.toLowerCase());
    }
}