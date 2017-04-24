import java.util.ArrayList;

public class Intrucoes {
	ArrayList<String> instrucoes;

	public Intrucoes() {
		instrucoes = new ArrayList<String>();
		}
	public void add(String i){
		instrucoes.add(i);
	}
	public ArrayList<String> retornaLista(){
		return instrucoes;
	}

}
