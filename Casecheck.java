package dsa;

import java.util.Scanner;

public class Casecheck {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any character");
	char ch = sc.next().trim().charAt(0);
	
	if(ch>+'a'&&ch<='z') {
		System.out.println("Lowercase");
	}
	else {
		System.out.println("Uppercase");
	}
	
	
	}

}
