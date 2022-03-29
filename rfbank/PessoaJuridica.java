package rfbank;

public class PessoaJuridica extends PessoaHeranca {
	
	private String cnpj;
	private String segmento;
	private String reponsavel;
	
	
	
	public PessoaJuridica() { //gcfs
		super();
		
	}


	public PessoaJuridica(String cnpj, String segmento, String reponsavel) { //gcuf
		super();
		this.cnpj = cnpj;
		this.segmento = segmento;
		this.reponsavel = reponsavel;
	}
	
	
	public String getCnpj() { //ggas
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getReponsavel() {
		return reponsavel;
	}
	public void setReponsavel(String reponsavel) {
		this.reponsavel = reponsavel;
	}

	
	
}
