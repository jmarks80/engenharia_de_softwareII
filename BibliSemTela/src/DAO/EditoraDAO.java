/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import basicos.Editora;
import connector.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 05220149
 */
public class EditoraDAO {
    private Connection connection;

    public EditoraDAO(){
	this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionaAutor(Editora edit){

	String sql;

	sql = "insert into autores(nome_fantasia, cnpj)"
				+ "values(?,?)";
		
	PreparedStatement statment;
		
	try {
            statment = connection.prepareStatement(sql);
			
            statment.setString(1, edit.getNomeFantasia());
            statment.setString(2, edit.getCNPJ());
            
            //statment.setInt(0, 0);
			
            statment.execute();
			
            statment.close();
			
            System.out.println("Editora Inserido com Sucesso!!");
			
			
	} catch (SQLException e) {
		e.getMessage();
	}
    }
}
