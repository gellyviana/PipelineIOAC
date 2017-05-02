import java.util.HashMap;

public class Instrucao {
	public String toString(){
		return "";
	}
	public boolean validaInstrucao(HashMap<String, Instrucao> pipe){
		
			return !(this.compara(pipe,"ID") || this.compara(pipe,"EX") || this.compara(pipe,"MEM"));
		
	}
	private boolean compara(HashMap<String, Instrucao> pipe, String estagio){
		if(this instanceof Inst3Op){
			Inst3Op inst = (Inst3Op) this;
			if(pipe.get(estagio) instanceof Inst3Op){
				Inst3Op comp = ((Inst3Op) pipe.get(estagio));

				return inst.getOperandoFont1().contains(comp.getOperandoDest().replaceFirst(",","")) ||
					   inst.getOperandoFont2().contains(comp.getOperandoDest().replaceFirst(",",""));
			}else if(pipe.get(estagio) instanceof Inst2Op){
				Inst2Op comp = ((Inst2Op) pipe.get(estagio));

				return inst.getOperandoFont1().contains(comp.getOperandoDest().replaceFirst(",","")) ||
						inst.getOperandoFont2().contains(comp.getOperandoDest().replaceFirst(",",""));
			}//else if(pipe.get(estagio)) instanceof InstSalto){
				//Instrucao comp = ((InstSalto) pipe.get(estagio));

				//return inst.getOperandoDest().contains(comp.getOperandoFont1().replaceFirst(",","")) ||
				//	   inst.getOperandoDest().contains(comp.getOperandoFont2().replaceFirst(",",""));
			//}
			return false;
		}
		else if(this instanceof Inst2Op){
			Inst2Op inst = (Inst2Op) this;
			if(pipe.get(estagio)  instanceof Inst3Op){
				Inst3Op comp = ((Inst3Op) pipe.get(estagio));

				return inst.getOperandoFont().contains(comp.getOperandoDest().replaceFirst(",","")); //||
					   //inst.getOperandoFont2().contains(comp.getOperandoDest().replaceFirst(",",""));
			}else if(pipe.get(estagio) instanceof Inst2Op){
				Inst2Op comp = ((Inst2Op) pipe.get(estagio));

				return inst.getOperandoFont().contains(comp.getOperandoDest().replaceFirst(",",""));
			}
			return false;
			//return inst.getOperandoDest().contains(((Inst2Op) pipe.get(estagio)).getOperandoFont().replaceFirst(",",""));
		}
		else{
			return false;
			//InstSalto inst = (InstSalto) this;
			//return inst.getOperandoDest().contains(((InstSalto) pipe.get(estagio)).getOperandoFont().replaceFirst(",",""));
		}
	}
}