package com.bridgelabz;
import java.util.Scanner;
public class WinLose 
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
	
	public static void checkwin()
	{

		char[] c = new char[10];
		c = TicTacToe();
		
		if((a[4] == userVar && a[2] == userVar && a[3] == userVar) ||
				(a[4] ==  && a[5] == userVar && a[6] == userVar) ||
				(a[7] == userVar && a[8] == userVar && a[9] == userVar) ||
				(a[1] == userVar && a[5] == userVar && a[9] == userVar) ||
				(a[3] == userVar && a[5] == userVar && a[7] == userVar) ||
				(a[1] == userVar && a[4] == userVar && a[7] == userVar) ||
				(a[3] == userVar && a[6] == userVar && a[9] == userVar))
		{
			System.out.println("player won");
		}
		else if((a[4] == userVar && a[2] == userVar && a[3] == userVar) ||
				(a[4] == userVar && a[5] == userVar && a[6] == userVar) ||
				(a[7] == userVar && a[8] == userVar && a[9] == userVar) ||
				(a[1] == userVar && a[5] == userVar && a[9] == userVar) ||
				(a[3] == userVar && a[5] == userVar && a[7] == userVar) ||
				(a[1] == userVar && a[4] == userVar && a[7] == userVar) ||
				(a[3] == userVar && a[6] == userVar && a[9] == userVar))
		{
			System.out.println("computer won");
		}
		else
		{
			System.out.println("tie");
		}
			
			
			
			
			
			
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		checkwin();
	}

}
