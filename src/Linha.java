import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
		
			String[] inst = linha.split(" "); 
			
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
	//Ve se tem conflito com as intruções que estão na pipe.
		Impressora impressora = new Impressora();
		HashMap<String, Instrucao> pipe = new HashMap<>();
		pipe.put("IF", new Instrucao());
		pipe.put("ID", new Instrucao());
		pipe.put("EX", new Instrucao());
		pipe.put("MEM", new Instrucao());
		pipe.put("WB", new Instrucao());

		for (int i = 0; i < listaDeIntrucoes.size() ;) {
			pipe.put("WB", pipe.get("MEM"));
			pipe.put("MEM", pipe.get("EX"));
			pipe.put("EX", pipe.get("ID"));
			pipe.put("ID", pipe.get("IF"));
			

			if (listaDeIntrucoes.get(i).validaInstrucao(pipe)){
				pipe.put("IF", listaDeIntrucoes.get(i));
				i++;				
			}
			else{
				pipe.put("IF", new Instrucao());
			}
			impressora.geraNovoEstagio(pipe);
		}
		impressora.imprime();
	}

}
