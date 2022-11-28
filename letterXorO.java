package com.bridgelabz;

import java.util.Scanner;;

public class letterXorO {
	public static void TicTacToe() {
		char[] a = new char[10]; 
		a[0] = ' ';
		a[1] = ' ';
		a[2] = ' ';
		a[3] = ' ';
		a[4] = ' ';
		a[5] = ' ';
		a[6] = ' ';
		a[7] = ' ';
		a[8] = ' ';
		a[9] = ' ';
		
		System.out.println(a[9]+" | "+ a[8]+" | " +a[7]);
		System.out.println(a[6]+" | "+ a[5]+" | " +a[4]);
		System.out.println(a[3]+" | "+ a[2]+" | " +a[1]);
	}
	public static void letterxoro(char a) {
		char[] b = new char[2];
		switch(a)
		{
		case 'X':
		case 'x':
			b[0] = 'X';
			b[1] = 'O';
			break;
			
		case 'O':
		case 'o': 
			b[0] = 'O';
			b[1] = 'X';
			break;
			
		default:
			System.out.println("Wrong input !!");
			break;
		}
		
		System.out.println("PLAYER : "+ b[0]);
		System.out.println("CPU : "+ b[1]);
		
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print(" Choose 'X' or 'O' :");
		char a = s.next().charAt(0);
		letterxoro(a);
		TicTacToe();
		s.close();
	}
	
}

