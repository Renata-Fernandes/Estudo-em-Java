package textosestrings;

public class ExpressoesRegulares2 {
	
	private String ddd;
	private String numero;
	
	public ExpressoesRegulares2(String ddd, String numero) {
		if(ddd == null || numero == null) {
			System.out.println("Telefone n�o existe");
		}
		
		if(!ddd.matches("\\d{2}")) {
			System.out.println("DDD inv�lido");
		}
	
		if(!numero.matches("\\d{8}|\\d{9}")){
				System.out.println("N�mero inv�lido");
	}
	
		this.ddd = ddd;
		this.numero = numero;
		
}
	
	@Override
	public String toString() {
		return "("+this.ddd+")"+this.numero;
	}

}
