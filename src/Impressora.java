/**
*
* @author Gelly Viana Mota
* @see Classe responsável em imprimir o que contém na pipeline. 
* @version 2.0
*
*/
import java.util.HashMap;
public class Impressora {
	
	private String saida;
	private Integer cicloAtual;

	public Impressora(){
		cicloAtual = 0;
		saida = "";
	}

	public void geraNovoEstagio(HashMap<String, Instrucao> pipe){
			this.cicloAtual++;

			this.saida+="\n-------------------------------------------------------\n";
			this.saida+="Ciclo " + this.cicloAtual+"\n";
			this.saida+="IF: " + pipe.get("IF")+"\n";
			this.saida+="ID: " + pipe.get("ID")+"\n";
			this.saida+="EX: " + pipe.get("EX")+"\n";
			this.saida+="MEM: " + pipe.get("MEM")+"\n";
			this.saida+="WB: " + pipe.get("WB");
	}

	public void imprime(){
		String stringFinal="Saída:\n\n";
		stringFinal+="Quantidade de ciclos total: "+this.cicloAtual+"\n";
		stringFinal+=this.saida;
		stringFinal+="\n-------------------------------------------------------";
		System.out.println(stringFinal);
	}
}