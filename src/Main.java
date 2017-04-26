import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author gelly
 *
 */
public class Main {

	public static void main(String[] args) throws IOException{
	
		FileInputStream stream= new FileInputStream("arquivo.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		ArrayList<Instrucao> listaDeIntrucoes=new ArrayList<>();

		while(linha != null) {
		/*
			if(linha.indexOf('$') != -1){
				String instrucao = linha.substring(0, linha.indexOf('$'));
				n.add(instrucao);
			}
			
			
		*/
			String[] inst=linha.split(" ");
			
			if(inst[0].equals("add")){
				listaDeIntrucoes.add(new Instrucao("3op", inst[0], inst[1], inst[2]+inst[3]));
			}else if(inst[0].equals("sub")){
				listaDeIntrucoes.add(new Instrucao("3op", inst[0], inst[1], inst[2]+inst[3]));
			}else if(inst[0].equals("lw")){
				listaDeIntrucoes.add(new Instrucao("2op", inst[0], inst[1], inst[2]));
			}else if(inst[0].equals("sw")){
				listaDeIntrucoes.add(new Instrucao("2op", inst[0], inst[1], inst[2]));
			}else if(inst[0].equals("beq")){
				listaDeIntrucoes.add(new Instrucao("2op", inst[0], inst[1]));
			}else if(inst[0].equals("bne")){
				listaDeIntrucoes.add(new Instrucao("2op", inst[0], inst[1]));
			}

			linha = br.readLine();

		}
	}

}
