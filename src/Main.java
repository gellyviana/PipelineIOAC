import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * 
 * @author gelly
 *
 */
public class Main {

	public static void main(String[] args) {
		try{
			FileInputStream arquivoLer = new FileInputStream("arquivo.txt");
			InputStreamReader input = new InputStreamReader(arquivoLer);
			BufferedReader buffer = new BufferedReader(input);
			
			String linha;
			do{
				linha = buffer.readLine();
				if(linha != null){
					StringTokenizer st = new StringTokenizer(linha);
					while(st.hasMoreTokens()){
						System.out.println(st.nextToken());
					}
				}
			}while(linha != null);
		}catch(Exception e){
			System.out.println("Erro ao ler arquivo.");
		}

	}

}
