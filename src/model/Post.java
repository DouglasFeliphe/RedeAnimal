package model;

import java.util.Date;
import com.mysql.jdbc.Blob;

public class Post {
    
    private int cpf;
    private int idAnimal;
    private String mensagem;
    private Date dataPost;    
	private boolean status;
	private Blob imagem;
    
	public Post() {
		
	}	
    public Post(int cpf, int idAnimal, Blob imagem) {
    	this.cpf = cpf;
    	this.idAnimal = idAnimal;
    }    
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public Date getDataPost() {
		return dataPost;
	}
	public void setDataPost(Date dataPost) {
		this.dataPost = dataPost;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Blob getImagem() {
		return imagem;
	}
	public void setImagem(Blob imagem) {
		this.imagem = imagem;
	}

   
    
}
