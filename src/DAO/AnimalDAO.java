package DAO;

import com.mysql.jdbc.*;

import model.Animal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnimalDAO {
    
    Conexao conexao = new Conexao();
//    private Animal animal = new Animal();

    private String sql;
    private PreparedStatement prepStat;
    private ResultSet rs;


    public void insert(Animal animal) throws SQLException{
        sql = "INSERT INTO animal (cpf_usuario, tipo, raca, porte, pelagem, sexo, situacao) VALUES(?,?,?,?,?,?,?);";
        try {
            conexao.conecta();
            prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
            prepStat.setString(1, animal.getCpf_usuario());
            prepStat.setString(2, animal.getTipo());
            prepStat.setString(3, animal.getRaca());
            prepStat.setString(4, animal.getPorte());
            prepStat.setString(5, animal.getPelagem());
            prepStat.setString(6, animal.getSexo());
            prepStat.setString(7, animal.getSituacao());
//          prepStat.setBlob(8, animal.getImagem());
                      
            prepStat.execute();
            
        } catch (ClassNotFoundException erro) {
           System.out.println("Erro ao inserir o animal \n"+erro);
        }
        finally
        {
            conexao.desconecta();            
        }
        
        
    }
    
    public Animal select() throws SQLException, ClassNotFoundException{
    	
    	 String sql = "SELECT * FROM animal;";
    	 conexao.conecta();
         prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
		
		
		ResultSet rs = prepStat.executeQuery();
		
		rs.next();
		
		Animal animal = new Animal();
		
		animal.setSituacao(rs.getString("situacao"));
		animal.setSexo(rs.getString("sexo"));
		
		return animal;
    	
    }
    
    
}
