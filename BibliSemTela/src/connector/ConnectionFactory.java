/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 05220149
 */
public class ConnectionFactory {
    public Connection getConnection() {
		
		String url="jdbc:mysql://localhost/biblio";
		String userName="root";
		String userPassword="root";
		
		try {

			return DriverManager.getConnection(url,userName,userPassword);
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e.getMessage());
			
		}
		
	}
}
