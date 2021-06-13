package Dummy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Occ1 {
	public static void main(String[] args) {
		String s="aacghijahaij";
		char[] CA = s.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c:CA)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
		Set<Character> uv=map.keySet();
		for(Character u:uv)
		{
			if(map.get(u)>1)
			{
				System.out.println("character "+ u +" repeating "+map.get(u)+"times");
			}
		}
			
		
	}
	

}
