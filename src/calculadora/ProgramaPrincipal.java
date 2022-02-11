package calculadora;

import java.util.Scanner;

import br.com.calculadora.model.*;
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
				
		System.out.println(Calculadora.soma(a,b));
		System.out.println(Calculadora.subtracao(a,b));
		System.out.println(Calculadora.multiplicacao(a,b));
		System.out.println(Calculadora.divisao(a,b));
		
	}

}
