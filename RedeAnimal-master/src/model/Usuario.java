package model;

public class Usuario{
	
	private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String cep;    
	private String telefone;
    private String email;
    private String username;
    private String senha;
    
    public Usuario() {
    	
    }
    
    public Usuario(String username, String senha) {
    	this.username = username;
    	this.senha = senha;
    }
    
    public Usuario (String cpf, String nome, String endereco, String cidade, String cep, String telefone, String email, String username, String senha) {
    	this.cpf = cpf;
    	this.nome = nome;
    	this.endereco = endereco;
    	this.cidade = cidade;
    	this.cep = cep;
    	this.telefone = telefone;
    	this.email = email;
    	this.username = username;
    	this.senha = senha;
    }
    
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
