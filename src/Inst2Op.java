public class Inst2Op extends Instrucao {

	private String nome;
	private String operando;

	public Instrucao(String nome, String operando){
		this.nome = nome;
		this.operando = operando;
	}

	public String toString(){
		return this.nome + this.operando;
	}

	public void setNome(String nome){
		this.nome=nome;
	}

	public void setOperando(String operando){
		this.operando=operando;
	}

	public String getNome(){
		return this.nome;
	}

	public String getOperando(){
		return this.operando;
	}
	
}