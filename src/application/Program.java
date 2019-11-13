package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Entre con o número de pagadores de taxas: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Informações do pagador de taxas #" + i);
			System.out.print("Pessoa fisica ou jurídica (f/j)?");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
		
			if (ch == 'f'){
				System.out.print("Gastos com saúde: ");
				double gastoSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			}
			else {
				System.out.print("Número de funcionários: ");
				int numFunc = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFunc));
			}
		}
		
		System.out.println();
		System.out.println("TAXAS PAGAS:");
		
		for (Contribuintes cont : list) {
			System.out.println(cont.getNome() + ": $ " + String.format("%.2f", cont.impostoArrecadado()));
		}
		
		double sum = 0;
		for (Contribuintes cont : list) {
			sum += cont.impostoArrecadado();
		}
		
		System.out.println();
		System.out.println("Taxas totais: $ " + sum);
		
		
		sc.close();
	}

}
