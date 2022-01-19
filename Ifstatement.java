package dsa;

import java.util.Scanner;

public class Ifstatement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your salary");
		int salary = sc.nextInt();
		
//		if(salary>10000) {
//			salary = salary + 2000;
//		}
//		else {
//			
//			salary = salary+1000;
//		}
//		
		if(salary>10000) {
			salary += 2000;
		}
		else if(salary>20000) {
			salary += 3000;
		}
		else {
			salary += 1000;
		}
		System.out.println("salary with bonus:"+salary);
	}
}