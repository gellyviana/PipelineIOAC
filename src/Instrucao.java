/**
*
* @author Gelly Viana Mota
* @see Classe responsável em utilizar cada instrução lida, colocado na Pipeline(HashMap). 
* @version 2.0
*
*/

import java.util.HashMap;

public class Instrucao {
	public String toString(){
		return "";
	}
	/**
	*Método responsável em analisar se as instruções estão nos estágios de conflito(ID, EX, MEM).
	*@param HashMap contendo as Instruções e String(Estágios).
	*@return Retorna Verdadeiro ou Falso.
	*
	*/
	public boolean validaInstrucao(HashMap<String, Instrucao> pipe){
		
			return !(this.compara(pipe,"ID") || this.compara(pipe,"EX") || this.compara(pipe,"MEM"));
		
	}
	/**
	*Método que analisa qual tipo de instrução instanciada e averigua as dependências entre os operadores das instruções.
	*@param HashMap contendo as Instruções e String(Estágios).
	*@return Retorna Verdadeiro ou Falso.
	*
	*/
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
			}
			return false;
		}
		else if(this instanceof Inst2Op){
			Inst2Op inst = (Inst2Op) this;
			if(pipe.get(estagio)  instanceof Inst3Op){
				Inst3Op comp = ((Inst3Op) pipe.get(estagio));

				return inst.getOperandoFont().contains(comp.getOperandoDest().replaceFirst(",",""));

			}else if(pipe.get(estagio) instanceof Inst2Op){
				Inst2Op comp = ((Inst2Op) pipe.get(estagio));

				return inst.getOperandoFont().contains(comp.getOperandoDest().replaceFirst(",",""));
			}
			return false;
			
		}
		else{
			return false;
		}
	}
}