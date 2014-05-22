package br.feevale.dojo;

public class NumeroFeliz {

	private int numero;
	
	
	public NumeroFeliz(int numero) {
		this.numero = numero;
	}
	
	public boolean eFeliz(){
		int temp = this.numero;
		int loopInf = 100;
		while (temp>1 && loopInf > 0){
			temp = potencia(temp);
			loopInf--;
		}
		if (temp ==1){
			return true;
		}else{
			return false;
		}
	}

	public int potencia(int pot){
		String temp = String.valueOf(pot);
		
		int i;
		int contador=0;
		for(i=0;i<temp.length();i++){//dalalana aprova
			char c = temp.charAt(i);
			int num = charToInt(c);
			int pot2 = num * num;
			contador += pot2;
		}
		return contador;
	}
	
	private int charToInt(char c) {
		return Integer.parseInt(String.valueOf(c));
	}
	
	
}
