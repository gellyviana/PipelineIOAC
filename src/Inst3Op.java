/**
*
* @author Gelly Viana Mota
* @see Classe responsável em armazenar as instruões com 3 operandos. 
* @version 2.0
*
*/
public class Inst3Op extends Instrucao{
	private String nome;
	private String operandoFont1;
	private String operandoFont2;
	private String operandoDest;

	public Inst3Op(String nome, String operandoDest, String operandoFont1, String operandoFont2){
		this.nome = nome;
		this.operandoDest = operandoDest;
		this.operandoFont1 = operandoFont1;
		this.operandoFont2 = operandoFont2;
		
	}

	public String toString(){
		return this.nome +" "+ this.operandoDest + this.operandoFont1 + this.operandoFont2;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setOperandoFont1(String operandoFont){
		this.operandoFont1 = operandoFont1;
	}

	public void setOperandoFont2(String operandoFont){
		this.operandoFont2 = operandoFont2;
	}

	public void setOperandoDest(String operandoDest){
		this.operandoDest=operandoDest;
	}

	public String getNome(){
		return this.nome;
	}

	public String getOperandoFont1(){
		return this.operandoFont1;
	}

	public String getOperandoFont2(){
		return this.operandoFont2;
	}

	public String getOperandoDest(){
		return this.operandoDest;
	}
	
}