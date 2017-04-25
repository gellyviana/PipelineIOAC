import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

public class Dependencia{
	private ArrayList<Integer> dependeDeQuem;
	private HashMap<String, Integer> dependencias;

	public Dependencia(){
		dependeDeQuem = new ArrayList<Integer>();
		dependencias = new HashMap<String, Integer>();
	}
	public void add(String instrucao, Integer linha){
		dependencias.put(instrucao, linha);
	}
	public void imprime(){
		Set<String> keys = dependencias.keySet();
		for (String key : keys ) {
			System.out.println("instrucao:" + key + "\nLinha:" + dependencias.get(key));
		}
	}
}