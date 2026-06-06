package model.especialidades;

import model.Medico;

public class Dermatologista extends Medico{
    
    public Dermatologista(String nome, String login, String senha, String especialidade, double valorBase) {
        super(nome, login, senha, "DERMATOLOGIA", valorBase);
    }
    
    @Override
    public boolean aceitaPlanoEspecifico(String plano){
        // REGRA FICTÍCIA: DERMATOLOGISTAS NÃO ATENDEM PLANOS DO TIPO "UNIMED BRONZE", POR EXEMPLO
        if(plano.toLowerCase().contains("bronze")){
            return false;
        }
        return super.aceitaPlanoEspecifico(plano);
    }

}
