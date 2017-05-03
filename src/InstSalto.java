/**
*
* @author Gelly Viana Mota
* @see Classe responsável em armazenar as instruões do tipo Salto. 
* @version 2.0
*
*/
public class InstSalto extends Instrucao {
	private String nome;
	private String operandoFont;
	private String operandoDest;

	public InstSalto(String nome, String operandoFont, String operandoDest){
		this.nome = nome;
		this.operandoFont = operandoFont;
		this.operandoDest = operandoDest;
	}

	public String toString(){
		return this.nome +" "+ this.operandoDest + this.operandoFont;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setOperandoFont(String operandoFont){
		this.operandoFont = operandoFont;
	}

	public void setOperandoDest(String operandoDest){
		this.operandoDest = operandoDest;
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