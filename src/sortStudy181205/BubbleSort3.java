package sortStudy181205;

import javaAlgorithmStudy.Algorithm;

public class BubbleSort3 implements Algorithm {

	// 10개의 임의의 수 저장, 오름차순으로 버블정렬
	// 좌우 번갈아가면서 정렬
	@Override
	public void run() {

		int[] arr = new int[10];
		int shift = 0;
		int left = 0;
		int right = arr.length;
		int tmp = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("앞뒤 버블정렬 전 -------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		while(left < right) {
			for(int i=left; i<right-1; i++) {
				if(arr[i] > arr[i+1]) {
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					shift = i;
				}
			}
			right = shift;
			for(int i=right; i > left; i--) {
				if(arr[i-1] > arr[i]) {
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
					shift = i;
				}
			}
			left = shift;
		}
		
		System.out.println("앞뒤 버블정렬 후 -------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
}
