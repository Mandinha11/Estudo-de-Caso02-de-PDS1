package Modelo;

public class Fornecedor {
	
	private String NomeEmpresa;
	private Long cnpj;
	private Long cpf;
	private Long telefone;
	
	public Fornecedor(){
		
	}
	
	public String getNomeEmpresa() {
		return NomeEmpresa;
	}
	public void setNomeEmpresa(String NomeEmpresa) {
		this.NomeEmpresa = NomeEmpresa;
	}
	public Long getCnpj() {
		return cnpj;
	}
	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	public Long getCpf() {
		return cpf;
	}
	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	

}
