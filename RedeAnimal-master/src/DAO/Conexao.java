/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;



public class Conexao {
    public Connection con;
    private Statement stm;
    
    private final String USUARIO = "root";
    private final String SENHA = "";
    private final String URL = "jdbc:mysql://localhost/banco_animal";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    

    public boolean conecta() throws ClassNotFoundException 
    {        
        try {
            Class.forName(DRIVER);
            con = (Connection) DriverManager.getConnection(URL, USUARIO, SENHA);
            stm = (Statement) con.createStatement();
            return true;
        } catch (SQLException erro) {
            return false;
        }
    }
  
    public boolean desconecta() 
    {
        try {
            con.close();
            return true;
        } catch (SQLException erro) {
        	return true;
        }
    }
    
    // Vai para a servlet
    
    
    public String testaConexao() throws ClassNotFoundException {
    	
    	if (conecta()) {
    		return "Conectado";
    	} else {
    		return "Desconectado";
    	}
    }
    
}
