public class Inst3Op extends Instrucao{
	private String nome;
	private String operandoFont;
	private String operandoDest;

	public Instrucao(String tipoOp, String nome, String operandoDest, String operandoFont){
		this.tipoOp = tipoOp;
		this.nome = nome;
		this.operandoFont = operandoFont;
		this.operandoDest = operandoDest;
	}

	public String toString(){
		return this.nome + this.operandoDest + this.operandoFont;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setOperandoFont(String operandoFont){
		this.operandoFont=operandoFont;
	}

	public void setOperandoDest(String operandoDest){
		this.operandoDest=operandoDest;
	}

	public String getNome(){
		return this.nome;
	}

	public String getOperandoFont(){
		return this.operandoFont;
	}

	public String getOperandoDest(){
		return this.operandoDest;
	}
	
}