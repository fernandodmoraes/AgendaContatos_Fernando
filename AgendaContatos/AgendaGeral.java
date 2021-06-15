package fernandodmoaraes.github.com.AgendaContatos;

public class AgendaGeral {

	private String nome;
	private String sobrenome;
	private String contatos;
	private String enderecos;
	private String empresas;
	
	public AgendaGeral(String nome, String sobrenome, String contatos, String enderecos, String empresas) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.contatos = contatos;
		this.enderecos = enderecos;
		this.empresas = empresas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getContatos() {
		return contatos;
	}
	public void setContatos(String contatos) {
		this.contatos = contatos;
	}
	public String getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(String enderecos) {
		this.enderecos = enderecos;
	}
	public String getEmpresas() {
		return empresas;
	}
	public void setEmpresas(String empresas) {
		this.empresas = empresas;
	}
	
}
