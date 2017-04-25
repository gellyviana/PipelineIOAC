import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author gelly
 *
 */
public class Main {

	public static void main(String[] args) throws IOException{
		Intrucoes n = new Intrucoes();
		Fonte1 f1 = new Fonte1();
		FileInputStream stream= new FileInputStream("arquivo.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		while(linha != null) {
			if(linha.indexOf('$') != -1){
				String instrucao = linha.substring(0, linha.indexOf('$'));
				n.add(instrucao);
			}
			else if (linha.indexOf(' ') != -1) {
				System.out.println("Dra Thaiza querendo botar fogo no plantão");

				String fonte1 = linha.substring(4, linha.indexOf(','));
				f1.add(fonte1);
			}
			String[] p=linha.split(" ", 2);			
			for(String k:p)
				if(k.contains("$")){
					f1.add(k);
				}
			linha = br.readLine();
		}
		System.out.println(n.retornaLista());
		System.out.println(f1.retornaLista());
	}

}
