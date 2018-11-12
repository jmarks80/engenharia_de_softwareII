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
public class Revista implements Produto, Promocional{

    private String nome;
    private String descricao;
    private double valor;
    private Editora e;
    
    public Revista(){
        
    }
    
    public Revista (String nomePar,String descPar, double valorPar, Editora ed){
        this.nome = nomePar;
        this.descricao = descPar;
        this.valor = valorPar;
        this.e = ed;
    }

    @Override
    public double getValor() {
        return this.valor;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
        
    }

    @Override
    public String getIsbn() {
        return "";
    }

    @Override
    public boolean aplicaDescontoDe(double percentagem) {
        if (percentagem <= 10 / 100) return true;
        else return false;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param e the e to set
     */
    public void setEditora(Editora e) {
        this.e = e;
    }
    
    
    
    
    
}
