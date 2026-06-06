/* --- ENTIDADE CONSULTA (AGENDAMENTO/REALIZAÇÃO) --- */
package model;

import java.time.LocalDate;

public class Consulta {
    
    private Medico medico;
    private Paciente paciente;
    private LocalDate data;
    private String status; // "AGENDADA", "EM_ESPERA", "REALIZADA", "CANCELADA"
    
    // DADOS PREENCHIDOS APENAS NA REALIZAÇÃO (MÓDULO NO MÉDICO)
    private String sintomas;
    private String diagnostico;
    private String tratamento;
    private String medicamentos;
    private String examesSolicitados;
    private String observacoes;
    private double valorPago;
    
    public Consulta(Medico medico, Paciente paciente, LocalDate data){
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.status = "AGENDADA"; //STATUS INICIAL PADRÃO
        this.valorPago = 0.0;
    }
    
    public Medico getMedico() { return medico; }
    public Paciente getPaciente() { return paciente; }
    public LocalDate getData() { return data; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getSintomas() { return sintomas; }
    public void setSintomas(String sintomas) { this.sintomas = sintomas; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public String getTratamento() { return tratamento; }
    public void setTratamento(String tratamento) { this.tratamento = tratamento; }

    public String getMedicamentos() { return medicamentos; }
    public void setMedicamentos(String medicamentos) { this.medicamentos = medicamentos; }

    public String getExamesSolicitados() { return examesSolicitados; }
    public void setExamesSolicitados(String examesSolicitados) { this.examesSolicitados = examesSolicitados; }

    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }

    public double getValorPago() { return valorPago; }
    public void setValorPago(double valorPago) { this.valorPago = valorPago; }
    
}
