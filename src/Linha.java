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
public class Linha {

	public static void main(String[] args) throws IOException{
		Inst2Op inst2 = new Inst2Op (" ", " " , " ");
		Inst3Op inst3 = new Inst3Op (" ", " ", " ", " ");
		FileInputStream stream = new FileInputStream("arquivo.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader br = new BufferedReader(reader);
		String linha = br.readLine();
		Integer contLinha = 1;
		ArrayList<Instrucao> listaDeIntrucoes = new ArrayList<>();

		while(linha != null) {
		
			String[] inst=linha.split(" ");
			
			if(inst[0].equals("add")){
				listaDeIntrucoes.add(new Inst3Op(inst[0], inst[1], inst[2], inst[3]));
			}else if(inst[0].equals("sub")){
				listaDeIntrucoes.add(new Inst3Op(inst[0], inst[1], inst[2], inst[3]));
			}else if(inst[0].equals("lw")){
				listaDeIntrucoes.add(new Inst2Op(inst[0], inst[1], inst[2]));
			}else if(inst[0].equals("sw")){
				listaDeIntrucoes.add(new Inst2Op(inst[0], inst[1], inst[2]));
			}else if(inst[0].equals("beq")){
				listaDeIntrucoes.add(new Inst3Op(inst[0], inst[1], inst[2], inst[3]));
			}else if(inst[0].equals("bne")){
				listaDeIntrucoes.add(new Inst3Op(inst[0], inst[1], inst[2], inst[3]));
			}

			contLinha ++;
			linha = br.readLine();
		}
		for (Instrucao t : listaDeIntrucoes ) {
			System.out.println(t);
		}
	}

}
