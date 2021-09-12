package application;

import java.util.Scanner;
import java.util.Locale;

import entities.remuneracao;

public class salarioEx02 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		remuneracao remu = new remuneracao();
		
		
		System.out.println("Name: ");
		remu.nome = sc.next();
		System.out.println("Gross salary: ");
		remu.sb = sc.nextDouble();
		System.out.println("Tax: ");
		remu.imposto = sc.nextDouble();
		 
		
		System.out.println("Emplyee: "+ remu);
		System.out.println("Which percentage to increase salary: ");

		
		double porcentagem = sc.nextDouble();
		remu.addPorcentagem(porcentagem);

		
		
		System.out.println("Updated data: "+ remu);
		
		
	
		sc.close();

	}

}
