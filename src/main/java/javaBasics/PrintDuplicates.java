package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
	public static void main(String[] args) {
		String[] names= {"Anush","Harish","Sai","Sai","Anush","Harish"};
		/*for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println(names[i]);
				}
			}
		}*/
		Set<String> s=new HashSet<String>();
		for(String name:names)
		{
			if(s.add(name)==false)
			{
				System.out.println(name);
			}
		}
	}

}
