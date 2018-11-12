/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

/**
 *
 * @author 05220149
 */
public class Livro implements Produto {
    
    private String nome;
    private String descricao;
    private double valor;
    private Autor autor;

    public Livro(){
        
    }
    
    public Livro(String n, double v, Autor a){
        this.nome = n;
        this.descricao = "";
        this.valor = v;
        this.autor = a;
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void mostraDetalhes(){
        
        System.out.println(this.nome + this.descricao + this.valor + this.autor.getNome() + 
                this.autor.getCpf() + this.autor.getEmail());
        
    }
    
    public void setAutor(Autor a){
        this.autor = a;
    }
    
   
    public Autor getAutor(){
        return this.autor;
    }
    
    public String getIsbn(){
        return "";
    }
    
}
