package DAO;

import com.mysql.jdbc.PreparedStatement;

//import model.Cargo;
import model.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {    
    Conexao conexao = new Conexao();
    Usuario usuario;
   
    private String sql;
    private PreparedStatement prepStat;
    private ResultSet resuSet;
    
    
    public void insert(Usuario usuario) throws SQLException {
        sql = "INSERT INTO usuario (cpf, nome, endereco, cidade, cep, telefone, email, username, senha) VALUES(?,?,?,?,?,?,?,?,?)";
        try {
        	conexao.conecta();
            prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
            prepStat.setString(1, usuario.getCpf());
            prepStat.setString(2, usuario.getNome());
            prepStat.setString(3, usuario.getEndereco());
            prepStat.setString(4, usuario.getCidade());
            prepStat.setString(5, usuario.getCep());
            prepStat.setString(6, usuario.getTelefone());
            prepStat.setString(7, usuario.getEmail());
            prepStat.setString(8, usuario.getUsername());
            prepStat.setString(9, usuario.getSenha());
            prepStat.execute();
        } catch (ClassNotFoundException erro) {
        	JOptionPane.showMessageDialog(null, "Erro ao inserir o usuário \n"+erro);        	
        }
        finally
        {
            conexao.desconecta();
            prepStat.close();
        }
    }
    

    public void atualizar(Usuario usuario) throws SQLException {
        sql = "UPDATE usuario SET nome = ? WHERE cpf = ?";
        try {
            conexao.conecta();
            prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
            prepStat.setString(1, usuario.getNome());
            prepStat.setString(2, usuario.getCpf());
            prepStat.execute();
        } catch (ClassNotFoundException erro) {
            //Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocorreu um Erro:\n"+erro);
        }
        finally
        {
            conexao.desconecta();
            prepStat.close();
        }
    }

    public void excluir(Usuario usuario) throws SQLException {
        sql = "DELETE FROM usuario WHERE cpf = ?";
        try {            
            conexao.conecta();
            prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
            prepStat.setString(1, usuario.getCpf());
            prepStat.execute();
            
        } catch (ClassNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na conexão com o banco de dados:\n"+erro);
        }
        finally
        {
            conexao.desconecta();
            prepStat.close();
        }
    }

    
    public List<Usuario> exibirUsuario() throws SQLException
    {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        sql = "SELECT * FROM usuario order by nome ASC";
        try {
            conexao.conecta();
            prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
            resuSet = prepStat.executeQuery();
            
            while(resuSet.next())
            {
                
                Usuario usuar = new Usuario();
                
                usuar.setNome(resuSet.getString("nome"));
                usuarios.add(usuar);
                
            }
        } catch (ClassNotFoundException erro) {
            //Logger.getLogger(CargoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n"+erro);
        }
        finally
        {
            conexao.desconecta();
            prepStat.close();
            resuSet.close();
        }
        return usuarios;
    }
    
    
    public Usuario login(String username, String senha) throws SQLException {
    	
    	 sql = "SELECT * FROM usuario where username = ? and senha = ?";
         try {
             conexao.conecta();
             prepStat = (PreparedStatement) conexao.con.prepareStatement(sql);
             prepStat.setString(1, usuario.getUsername());
             prepStat.setString(2, usuario.getSenha());
             resuSet = prepStat.executeQuery();
             
             Usuario usuario = new Usuario();
             while(resuSet.next())
             {                 
            	 while (resuSet.next()) {
                     if (resuSet.getString("senha").equals(senha) && resuSet.getString("username").equals(username) ) {
                    	 JOptionPane.showMessageDialog(null, "Usuário cadastrado: " + username);
                         return usuario;
                     }
                     else{
                         JOptionPane.showMessageDialog(null, "Usuário não existe");
                         return usuario;
                     }
                 }
                 return usuario;                 
             }
         } catch (ClassNotFoundException erro) {
        	 System.out.println("Ocorreu um erro na verificação do login\n" + erro);
         }
         finally
         {
             conexao.desconecta();
             prepStat.close();
             resuSet.close();
         }
		return usuario;    	
    }
    
   
}
