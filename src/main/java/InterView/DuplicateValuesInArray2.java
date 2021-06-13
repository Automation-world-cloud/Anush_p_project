package InterView;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValuesInArray2 {
	public static void main(String[] args) {
		String [] name= {"java","mava","kova","rava","mava","rava"};
		
		Set<String> s=new HashSet<String>();
		for(int i=0;i<name.length;i++)
		{
			if(s.add(name[i])==false)
			{
				System.out.println(name[i]);
			}
		}

}
}