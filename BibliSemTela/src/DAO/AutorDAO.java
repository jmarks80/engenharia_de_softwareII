/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import basicos.Autor;
import basicos.Livro;
import connector.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 05220149
 */
public class AutorDAO {
    private Connection connection;

    public AutorDAO(){
	this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionaAutor(Autor autor){

	String sql;

	sql = "insert into autores(nome, email, cpf)"
				+ "values(?,?,?)";
		
	PreparedStatement statment;
		
	try {
            statment = connection.prepareStatement(sql);
			
            statment.setString(1, autor.getNome());
            statment.setString(2, autor.getEmail());
            statment.setString(3, autor.getCpf());
            //statment.setInt(0, 0);
			
            statment.execute();
			
            statment.close();
			
            System.out.println("Autor Inserido com Sucesso!!");
			
			
	} catch (SQLException e) {
		e.getMessage();
	}
    }
    
    public Autor buscaContatoPorNome(String nomeAutor){
		
	String sql = "select * from  autor where nome=?";
		
	try {
            PreparedStatement statement = connection.prepareStatement(sql);
			
            statement.setString(1, nomeAutor);

            ResultSet resultSet = statement.executeQuery();

            Autor autor = new Autor();

            while (resultSet.next()) {

                    //autor.setId(resultSet.getLong("id"));
                    autor.setNome(resultSet.getString("nome"));
                    autor.setEmail(resultSet.getString("email"));
                    autor.setCpf(resultSet.getString("cpf"));	
            }

            return autor;	

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
    
     public Autor buscaContatoPorCPF(String cpfAutor){
		
	String sql = "select * from  autor where cpf=?";
		
	try {
            PreparedStatement statement = connection.prepareStatement(sql);
			
            statement.setString(1, cpfAutor);

            ResultSet resultSet = statement.executeQuery();

            Autor autor = new Autor();

            while (resultSet.next()) {

                    //autor.setId(resultSet.getLong("id"));
                    autor.setNome(resultSet.getString("nome"));
                    autor.setEmail(resultSet.getString("email"));
                    autor.setCpf(resultSet.getString("cpf"));	
            }

            return autor;	

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
	
	public ArrayList<Livro> listaContatos(){

		return null;	

	}

	public void excluiLivro(){


	}
}
