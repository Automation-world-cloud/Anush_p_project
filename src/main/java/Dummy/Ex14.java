package Dummy;

import java.util.Arrays;
import java.util.Collections;

public class Ex14 {
	public static void main(String[] args) {
		int[] num= {1,2,9,0,6,7,4,8};
		int temp;
		for(int i=0;i<num.length;i++)
		{
		for(int j=i+1;j<num.length;j++)
		{
			if(num[i]<num[j])
			{
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		System.out.println(num[i]);
		}
	}


}
