package Dummy;

import java.util.HashMap;
import java.util.Map;

public class Occ {
	public static void main(String[] args) {
		String name="JAVA programming";
		char[] ca = name.toCharArray();
		
		
		Map<Character,Integer> cm=new HashMap<Character,Integer>();
		for( Character c:ca)
			
		{
			if(cm.containsKey(c))
			{
			cm.put(c, cm.get(c)+1);
			}
			else
			{
				cm.put(c, 1);
			}
			
		}
		System.out.println(cm);
	}

}
