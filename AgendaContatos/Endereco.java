package fernandodmoaraes.github.com.AgendaContatos;

public class Endereco {
	
	private String rua;
	private String complemento;
	private String cep;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, String complemento, String cep, String cidade, String estado) {
		super();
		this.rua = rua;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
