/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicos;

import DAO.AutorDAO;

/**
 *
 * @author 05220149
 */
public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public Autor(){
    }
    
    public Autor(String nomePar,String emailPar,String cpfPar){
        this.nome = nomePar;
        this.email = emailPar;
        this.cpf = cpfPar;

        //AutorDAO autorDAO = new AutorDAO();
        //autorDAO.adicionaAutor();
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void mostraDetalhes(){
        
    }
    
}
