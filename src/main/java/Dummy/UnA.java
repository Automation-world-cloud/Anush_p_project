package Dummy;

import java.util.HashSet;
import java.util.Set;

public class UnA {
	public static void main(String[] args) {
		int a[]= {5,6,8,9,5,8};
		
		Set s=new HashSet();
		for(int i=0;i<a.length;i++)
		{
			if(s.add(a[i]))
			{
				System.out.print(a[i]);
			}
		}
		//System.out.println(a[i]);
	}

}
