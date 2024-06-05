package com.hugo;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.print("Por favor, digite o número da Conta: ");
		numero = sc.nextInt();
		
		System.out.print("Por favor, digite o número da Agência!: ");
		agencia = sc.next();
		sc.nextLine();
		
		System.out.print("Agora, digite o Nome do Usuário: ");
		nomeCliente = sc.nextLine();
		
		System.out.print("Informe seu Saldo atual: ");
		saldo = sc.nextDouble();
		
		System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
				agencia + " conta " + numero + " e seu Saldo " + saldo + " já está disponivel para saque.");
		
		sc.close();
	}

}
