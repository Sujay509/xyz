package com.bridgelabz;

public class ShowBoard 
{
	public static void showboard() 
	{
		System.out.println(" | "+" | ");
		System.out.println(" | "+" | ");
		System.out.println(" | "+" | ");	 
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
       showboard();
	}

}
