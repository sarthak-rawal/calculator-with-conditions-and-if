package dsa;

import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		

	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of n");
	int n = sc.nextInt();
	
	//for(int i=1;i<=n;i++) {
		
	//	System.out.println(i+" ");
	//	System.out.println("Hello World");
//	}
//	int i = 1;
//	while(i<=n) {
//		System.out.println("hello world");
//		i++;
//	}
//		
	int i=1;
	do {
		System.out.println("hello world");
		i++;
	}while(i<=n);
	}

}
