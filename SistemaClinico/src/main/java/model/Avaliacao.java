package model;

public class Avaliacao {
    
    private String texto;
    private int estrelas;
    
    public Avaliacao(String texto, int estrelas){
        if(estrelas < 1 || estrelas > 5){
            throw new IllegalArgumentException("A quantidade deve ser de 1 a 5.");
        }
        this.texto = texto;
        this.estrelas = estrelas;
    }
    
    public String getTexto(){return texto;}
    public int getEstrelas(){return estrelas;}
  
}
