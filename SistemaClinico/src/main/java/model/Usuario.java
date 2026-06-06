/* --- CLASSE ABSTRATA (BASE PARA MÉDICO E PACIENTE) --- */
package model;

public abstract class Usuario {
    private String nome;
    private String login;
    private String senha;
    private String tipo;//"MÉDICO" ou "PACIENTE"
    
    public Usuario(String nome, String cpf, String senha, String tipo){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }
    
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public String getLogin(){return login;}
    public void setLogin(String login){this.login = login;}
    
    public String getSenha(){return senha;}
    public void setSenha(String senha){this.senha = senha;}
    
    public String getTipo(){return tipo;}
}
