package model;

import java.util.Date;
import com.mysql.jdbc.Blob;

public class Post {
    
	private String titulo;
    private Usuario usuario;
    private Animal animal;
    private String descricao;
    private Date dataPost;    
	private boolean status;
	private Blob imagem;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String mensagem) {
		this.descricao = mensagem;
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
		return this.imagem;
	}
	public void setImagem(Blob imagem) {
		this.imagem = imagem;
	}
	
	
	
	
	
    
	
   
    
}
