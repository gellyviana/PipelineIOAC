public class InstSalto extends Intrucao {
	private String tipoOp;
	private String nome;
	private String operandoFont;
	private String operandoDest;

	public Instrucao(String tipoOp, String nome, String operandoFont, String operandoDest){
		this.tipoOp = tipoOp;
		this.nome = nome;
		this.operandoFont = operandoFont;
		this.operandoDest = operandoDest;
	}

	public String toString(){
		return this.nome + this.operandoDest + this.operandoFont;
	}

	public void setTipoOp(String tipoOp){
		this.tipoOp=tipoOp;
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

	public String getTipoOp(){
		return this.tipoOp;
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