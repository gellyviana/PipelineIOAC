import java.util.ArrayList;

public class Destino {
	ArrayList<String> destino;

	public Destino() {
		destino = new ArrayList<String>();
		}
	public void add(String i){
		destino.add(i);
	}
	public ArrayList<String> retornaLista(){
		return destino;
	}

}
