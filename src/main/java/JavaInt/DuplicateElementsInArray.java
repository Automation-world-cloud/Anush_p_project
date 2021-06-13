package JavaInt;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray {
	public static void main(String[] args) {
		String[] n= {"abc","bbc","cbc","abc","1","1"};
		/*for(int i=0;i<n.length;i++)//bruteforce method
		{
			for(int j=i+1;j<n.length;j++)
			{
				if(n[i]==n[j])
				{
					System.out.println(n[j]);
				}
				
			}
		}*/
		Set<String> s=new HashSet<String>();
		for(String ele:n)
		{
		
		if(s.add(ele)==false)
		{
			System.out.println(ele);
		}
	}
	}
}
