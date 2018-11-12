/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import basicos.Livro;
import basicos.Produto;
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
public class ProdutoDAO {
    private Connection connection;

    public ProdutoDAO(){
	this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionaProduto(Produto produto){

	String sql;

	sql = "insert into produtos(nome, descricao, valor)"
				+ "values(?,?,?)";
		
	PreparedStatement statment;
		
	try {
            statment = connection.prepareStatement(sql);
			
            statment.setString(1, produto.getNome());
            statment.setString(2, produto.getDescricao());
            statment.setDouble(3, produto.getValor());
            //statment.setInt(0, 0);
			
            statment.execute();
			
            statment.close();
			
            System.out.println("Livro Inserido com Sucesso!!");
			
			
	} catch (SQLException e) {
		e.getMessage();
	}
    }
    
   /* public Livro buscaContatoPorId(int idContato){
		
	String sql = "select * from  contatos where id=?";
		
	try {
            PreparedStatement statement = connection.prepareStatement(sql);
			
            statement.setLong(1, idContato);

            ResultSet resultSet = statement.executeQuery();

            Livro livro = new Livro();

            while (resultSet.next()) {

                    livro.setId(resultSet.getLong("id"));
                    livro.setNome(resultSet.getString("nome"));
                    livro.setEndereco(resultSet.getString("edereco"));
                    livro.setEmail(resultSet.getString("email"));	
            }

            return livro;	

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
    }

	}*/
	
	public ArrayList<Livro> listaContatos(){

		return null;	

	}

	public void excluiLivro(){


	}
}
