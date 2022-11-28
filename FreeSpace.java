package com.bridgelabz;

import java.util.Scanner;

public class FreeSpace 
{
	public static char[] TicTacToe() 
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
		System.out.println(a[1]+" | "+ a[2]+" | " +a[3]);
		System.out.println(a[4]+" | "+ a[5]+" | " +a[6]);
		System.out.println(a[7]+" | "+ a[8]+" | " +a[9]);
		return a;
	}
	
	public static void check(char[] c, int b, char[] a)
	{
		if(a[b] == ' ')
		{
			a[b] = c[0];
		}
		else {
			System.out.println("Wrong Move !!\n Try Again");
		}
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
		char[] c = new char[10];
		b=letterxoro(a);
		c = TicTacToe();
		int x=0;
		while(x != 1)
		{
			
			System.out.print("Enter POSITION : ");
			int n = s.nextInt();
			check(b, n, c);
			
			if (n == 10)
			{
				x=1;
			}
		}
		
		s.close();
	}
}
