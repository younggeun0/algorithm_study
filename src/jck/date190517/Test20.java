package jck.date190517;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test20 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int remainder = 0; 
		List<Integer> divisors = new ArrayList<Integer>();
		
		for(int i=1; i<=n; i++) {
			
			remainder = n%i;
			
			if (remainder == 0) {
				System.out.println("¾à¼ö : "+i);
				divisors.add(i);
			}
		}
		
		System.out.println(divisors);
	}
}
