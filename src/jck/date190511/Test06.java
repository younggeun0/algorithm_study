package jck.date190511;

public class Test06 {

	public static void main(String[] args) {
		
		double sum = 0;
		for(int i=1; i<100; i++) {
			
			if (i % 2 == 0) {
				sum += i/(double)(i+1);
			} else {
				sum += (-1)*(i/(double)(i+1));
			}
		}
		
		System.out.println(sum);
	}
}
