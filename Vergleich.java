//package com.javatutorialhq.java.tutorial.scanner;
import java.util.Scanner;
public class Vergleich{
	public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	if(a>b){
		System.out.println("a ist gut");
	}
	else if(a<b)
	{
		System.out.println("b ist gut");
	}
	else{
	System.out.println("sie sind gleich.");
	}
	}


}