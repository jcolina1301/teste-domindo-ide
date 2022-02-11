package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
				
		Gato gato = new Gato();
		gato.setNome("Laranjinha");
		gato.setCor("Branco e marrom claro");
		gato.setIdade(3);
		
		
		System.out.println(gato);
		
		Gato gato2 =new Gato();
		gato2.setNome("Sabrina");
		gato2.setCor("Cinza");
		gato2.setIdade(3);
		
		System.out.println("Meu gato se chama:" + gato2.getNome());
		
		

	}

}
