public class Inst2Op extends Instrucao {

	private String nome;
	private String operandoDest;
	private String operandoFont;

	public Inst2Op(String nome, String operandoDest, String operandoFont){
		this.nome = nome;
		this.operandoDest = operandoDest;
		this.operandoFont = operandoFont;
	}

	public String toString(){
		return this.nome +" "+ this.operandoDest + this.operandoFont;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setOperandoDest(String operandoDest){
		this.operandoDest = operandoDest;
	}

	public String getNome(){
		return this.nome;
	}

	public String getOperandoDest(){
		return this.operandoDest;
	}

	public void setOperandoFont(String operandoFont){
		this.operandoFont = operandoFont;
	}

	public String getOperandoFont(){
		return this.operandoFont;
	}
	
}