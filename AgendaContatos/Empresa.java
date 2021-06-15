package fernandodmoaraes.github.com.AgendaContatos;

public class Empresa {
	
	private String nomeEmpresa;
	private String contatoEmpresa;
	private String enderecoEmpresa;
	
	public Empresa(String nomeEmpresa, String contatoEmpresa, String enderecoEmpresa) {
		super();
		this.nomeEmpresa = nomeEmpresa;
		this.contatoEmpresa = contatoEmpresa;
		this.enderecoEmpresa = enderecoEmpresa;
	}
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getContatoEmpresa() {
		return contatoEmpresa;
	}
	public void setContatoEmpresa(String contatoEmpresa) {
		this.contatoEmpresa = contatoEmpresa;
	}
	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}
	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}
	
}
