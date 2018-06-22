package model;
public class Animal {
    
    private int idAnimal;
   	private String tipo;
    private String raca;
    private String porte;
    private String pelagem;
    private String sexo;
    private String situacao;
    private String cpf_usuario;
    /*private Blob imagem;
     */
    
    public String getCpf_usuario() {
		return cpf_usuario;
	}
	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}
	
	public int getIdAnimal() {
		return idAnimal;
	}	
	public void setIdAnimal(int idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	/*public Blob getImagem() {
		return imagem;
	}
	public void setImagem(Blob imagem) {
		this.imagem = imagem;
	}*/
}
