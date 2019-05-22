package jck.date190522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	
	public static void main(String[] args) {
		
		Integer[] input = { 11,2,133,26,77,5,44,21,68 };
		
		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		Arrays.sort(input, Collections.reverseOrder());
		
		List<String> list = new ArrayList<String>();
		
		list.add("호옹이?");
		list.add("바다");
		list.add("가나다");
		list.add("영근이");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		System.out.println();
	}

}
