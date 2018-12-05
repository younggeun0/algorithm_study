package sortStudy181205;

import javaAlgorithmStudy.Algorithm;

public class BubbleSort2 implements Algorithm{

	// 10개의 임의의 수 저장, 오름차순으로 버블정렬
	// 특정 회전에서 정렬 수행 중 교환이 한번도 이루어지지 않으면 정렬완료, 종료
	// 교환횟수와 정렬된 자료를 출력
	@Override
	public void run() {
		
		int[] arr = new int[10];
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("버블정렬 전 ---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<arr.length-1-i; j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					cnt++;
					flag = true;
				}
			}
			if (flag != true) {
				System.out.println("정렬 끝");
				break;
			}
		}
		
		System.out.println("버블정렬 후 ---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("회전 수 : "+cnt);
	}
}
