package jck.date190519;

import java.util.Arrays;

public class Test28 {
	
	static int a_idx = 0, b_idx = 0, m_idx = -1;
	
	static void fillA(int[] a, int[] mergedArr) {
		
		do {
			m_idx++;
			mergedArr[m_idx] = a[a_idx];
			a_idx++;
			
		} while(a[a_idx] != 0);
		
		finish(mergedArr);
	}
	
	static void fillB(int[] b, int[] mergedArr) {
		
		do {
			m_idx++;
			mergedArr[m_idx] = b[b_idx];
			b_idx++;
		} while (b[b_idx] != 0);
		
		finish(mergedArr);
	}
	
	static void finish(int[] mergedArr) {
		m_idx++;
		mergedArr[m_idx] = 0;
		
		System.out.println(Arrays.toString(mergedArr));
		
		System.exit(0);
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,3,5,8,9,10,12,13,0};
		int[] b = {1,3,5,7,0};
		int[] mergedArr = new int[20];
		
		while(true) {
			m_idx++;
			
			if (a[a_idx] < b[b_idx]) { // a값이 b보다 작으면 
				// a값을 merged에 넣고 인덱스 증가
				mergedArr[m_idx] = a[a_idx];
				a_idx++;
				
				if (a[a_idx] == 0) {
					fillB(b,mergedArr);
				}
				
			} else if (a[a_idx] == b[b_idx]) { // 두 값이 같으면

				// 둘 중 한 값을 넣고 둘다 인덱스 증가
				mergedArr[m_idx] = a[a_idx];
				a_idx++;
				b_idx++;
				
				if (a[a_idx]==0) {
					fillB(b,mergedArr);
				} else if (b[b_idx] == 0) {
					fillA(a,mergedArr);
				}
				
			} else { // b의 값이 a값보다 작을 때
				// b를 merged에 넣고 인덱스 증가
				mergedArr[m_idx] = b[b_idx];
				b_idx++;
				
				if(b[b_idx]==0) {
					fillA(a,mergedArr);
				}
			}
		}
	}
}
