package DAO;

import com.mysql.jdbc.*;

import model.Animal;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AnimalDAO {
    
   
    
    Conexao conexao = new Conexao();
    Animal animal = new Animal();

    private String sql;
    private PreparedStatement prepStat;
    private ResultSet rs;


    public void insert(Animal animal) throws SQLException{
        sql = "INSERT INTO animal (cpf_usuario, tipo, raca, porte, pelagem, sexo, situacao, imagem) VALUES(?,?,?,?,?,?,?,?)";
        try {
            conexao.conecta();
            prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
            prepStat.setString(1, animal.getCpf());
            prepStat.setString(2, animal.getTipo());
            prepStat.setString(3, animal.getRaca());
            prepStat.setString(4, animal.getPorte());
            prepStat.setString(5, animal.getPelagem());
            prepStat.setString(6, animal.getSexo());
            prepStat.setString(7, animal.getSituacao());
            prepStat.setBlob(8, animal.getImagem());
                      
            prepStat.execute();
            
        } catch (ClassNotFoundException erro) {
            //Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("Erro ao inserir o animal \n"+erro);
        }
        finally
        {
            conexao.desconecta();
            prepStat.close();
        }
    }
}
