package dsa;

import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
//	if(a>b&&a>c) {
//		System.out.println("The largest no. is A="+a);
//	}
//	else if(b>a&&b>c) {
//		System.out.println("The largest no. is B="+b);
//		
//	}
//	else {
//		System.out.println("The largest no. is C="+c);
//	}
//	int max=a;
//	if(b>max) {
//		max=b;
//	}
//	if(c>max) {
//		max = c;
//	}
	int max = Math.max(c, Math.max(a, b));
	System.out.println(max);
	}

}
