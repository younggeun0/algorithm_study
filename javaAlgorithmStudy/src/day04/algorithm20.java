package day04;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 정수를 입력 받아 소인수를 구해 출력?? 이거 내용 다시 봐봐야 할듯
public class algorithm20 implements Algorithm {

	@Override
	public void run() {

		int[] a = new int[100];
		int num, a_index, d, e, mok, nmg;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		a_index = -1;
		d = 2;				// 제수
		
		while(true) {
			
			e = (int)Math.sqrt(num);
			System.out.println("입력값의 제곱근은 : " + e);
			
			if(d > e) {
				d = num;
				break;
			}
			
			mok = num / d;
			nmg = num - mok * d;
			
			if(nmg == 0) {
				break;
			} else {
				d++;
			}
			
			a_index++;
			a[a_index] = d;
			
			if(num == d) {
				break;
			}
			
			num = mok;
		}
		
		for(int i = 0; i <= a_index; i++) {
			System.out.println(a[a_index]);
		}
	}

}
