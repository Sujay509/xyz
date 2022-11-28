package com.bridgelabz;

import java.util.Scanner;

public class MakeaMove 
{
	public static void TicTacToe(char[] c, int b) 
	{
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
		
		a[b] = c[0];
		System.out.println(a[1]+" | "+ a[2]+" | " +a[3]);
		System.out.println(a[4]+" | "+ a[5]+" | " +a[6]);
		System.out.println(a[7]+" | "+ a[8]+" | " +a[9]);
	}
	
	public static char[] letterxoro(char a) {
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
		
		return b;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print(" Choose 'X' or 'O' :");
		char a = s.next().charAt(0);
		char[] b = new char[2];
		b=letterxoro(a);
		TicTacToe(b, 0);
		System.out.print("Enter POSITION : ");
		int n = s.nextInt();
		
		TicTacToe(b, n);
		s.close();
	}

}
