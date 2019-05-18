package jck.date190517;

import java.util.Scanner;

public class Test19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int big = 0, small = 0, gcd = 0, lcm = 0, quotient = 0, remainder = 0;
		
		
		if (num1 >= num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		
		while(true) {
			quotient = big/small;
			remainder = big%small;
			
			if (remainder == 0) {
				gcd = small;
				lcm = num1*num2/gcd;
				
				System.out.println("최대 공약수 : "+gcd+", 최소 공배수 : "+lcm);
				break;
			}
			
			big = small;
			small = remainder;
		}
	}
}
