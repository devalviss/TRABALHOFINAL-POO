package model;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Usuario{
    private int idade;
    private String planoSaude;
    private List<Consulta> prontuario;

    public Paciente(String nome, String cpf, String senha, String tipo) {
        super(nome, cpf, senha, "PACIENTE");
        this.idade = idade;
        this.planoSaude = (planoSaude == null || planoSaude.trim().isEmpty()) ? "não tenho" : planoSaude;
        this.prontuario = new ArrayList<>();
    }
    
    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}
    
    public String getPlanoSaude(){return planoSaude;}
    public void setPlanoSuade(String planoSaude){this.planoSaude = planoSaude;}
    
    public List<Consulta> getProntuario(){return prontuario;}
    
    public void adicionarAoProntuario(Consulta consulta){
        this.prontuario.add(consulta);
    }
}