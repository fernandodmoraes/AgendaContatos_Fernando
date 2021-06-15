package fernandodmoaraes.github.com.AgendaContatos;

public class Contato {
	
	private String telefoneFixo;
	private String telefoneCelular;
	private String telefoneEmpresa;
	private String email;
	
	
	public Contato(String telefoneFixo, String telefoneCelular, String telefoneEmpresa, String email) {
		super();
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.telefoneEmpresa = telefoneEmpresa;
		this.email = email;
	}
	
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	public String getTelefoneCelular() {
		return telefoneCelular;
	}
	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}
	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
