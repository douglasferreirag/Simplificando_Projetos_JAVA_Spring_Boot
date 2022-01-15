package com.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

	public Condutor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Condutor condutor = new Condutor(new Carro());
		
		condutor.automovel();

	}
	
	
	@Autowired
	private Veiculo veiculo;
	
	
	public Condutor (Veiculo obj) {
		
			this.veiculo = obj;
		
	}
	
	public void automovel() {
		
			
			veiculo.acao();
		
		
	}

}
