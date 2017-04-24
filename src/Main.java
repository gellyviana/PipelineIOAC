import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.io.IOException;
/**
 * 
 * @author gelly
 *
 */
public class Main {

	public static void main(String[] args) throws IOException{
		Intrucoes n = new Intrucoes();
		FileInputStream stream;
		stream = new FileInputStream("arquivo.txt");
		InputStreamReader reader;
		reader = new InputStreamReader(stream);
		BufferedReader br;
		br = new BufferedReader(reader);
		String linha = br.readLine();
		while(linha != null) {
			//if(linha.indexOf('$') != -1){
			//	String instrucao = linha.substring(0, linha.indexOf('$'));
			//	n.add(instrucao);
			//}
			String[] p=linha.split("\\s");			
			System.out.println("linha");
			for(String k:p)
				System.out.println(k);

			linha = br.readLine();
		}
		System.out.println(n.retornaLista());
	}

}
