package jck.date190519;

import java.util.Scanner;

public class Test27 {
	
	public static void main(String[] args) {
		
		int[][] data = {
			{1,2,3,4,5,6,7,8,9,10},
			{100,77,25,80,90,65,89,98,66,54}
		};
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int start = 0, last = data[0].length-1, m = 0;
		
		while(true) {
			if (start <= last) {
				m = (start+last)/2;
				
				if (input == data[0][m]) {
					System.out.println("입력 결과 존재, 출력 : "+input+", data[1]["+m+"] : "+data[1][m]);
					break;
				}
				
				if (input < data[0][m]) {
					last = m-1;
				} else 
					start = m+1;
			} else {
				System.out.println("입력한 번호["+input+"]가 존재하지 않음");
				break;
			}
		}
	}
}
