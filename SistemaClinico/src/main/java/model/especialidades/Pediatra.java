package model.especialidades;

import model.Medico;

public class Pediatra extends Medico{
    
    public Pediatra(String nome, String login, String senha, String especialidade, double valorBase) {
        super(nome, login, senha, "PEDIATRIA", valorBase);
    }
    
    @Override
    public int getLimitePacientesDiarios(){
        //REGRA: PEDIATRAS ATENDEM NO MÁXIMO 2 PACIENTES POR DIA
        return 2;
    }
    
}
