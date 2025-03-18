package br.univille;

public class Cliente {

    //CONSTRUTOR COM PARAMETRO
    public Cliente(String nome) {
        this.nome = nome;
    }
    //CONSTRUTOR SEM PARAMETRO
    public Cliente() {
    }
    //VARIAVEL OU ATRIBUTO
    private String nome;
    //METODO TRANSFORMADOR
    public String toString(){
        return getNome();
    }
    //MÉTODOS GETTER E SETTER 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}
