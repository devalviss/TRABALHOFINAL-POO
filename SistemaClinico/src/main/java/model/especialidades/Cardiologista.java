package model.especialidades;

import model.Medico;

public class Cardiologista extends Medico {
    
    public Cardiologista(String nome, String login, String senha, String especialidade, double valorBase) {
        super(nome, login, senha, "CARDIOLOGIA", valorBase);
    }
    
    @Override
    public double getValorConsulta(){
        // REGRA: CARDIOLOGISTA COBRAM UMA TAXA ADICIONAL DE 20% SOBRE O VALOR BASE
        return super.getValorConsulta() * 1.20;
    }
    
}
