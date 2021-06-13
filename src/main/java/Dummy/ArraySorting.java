package Dummy;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {
	public static void main(String[] args) {
		int[] num= {3,4,6,2,1,5};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

}
