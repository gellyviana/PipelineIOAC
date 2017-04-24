import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
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
		FileInputStream stream;
		stream = new FileInputStream("arquivo.txt");
		InputStreamReader reader;
		reader = new InputStreamReader(stream);
		BufferedReader br;
		br = new BufferedReader(reader);
		String linha = br.readLine();
		while(linha != null) {
		   String nome = linha.substring(0, linha.indexOf('|'));
		   String cidade = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
		   String compras = linha.substring(linha.lastIndexOf('|') + 1, linha.length());
		   System.out.println(nome);
		   System.out.println(cidade);
		   System.out.println(compras);
		   linha = br.readLine();
		}
	}

}
