package javTricky;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsByHasMap {
	public static void main(String[] args) {
		String[] course= {"java","sel","java","c#","api","sel"};
		Map<String,Integer> info=new HashMap<String,Integer>();
		for( String c:course)
		{
			Integer count = info.get(c);
			
			if(count==null)
			{
				info.put(c,1);
			}
			else
			{
				info.put(c,++count);
			}
		}
		//print duplicate elements
		Set<Entry<String, Integer>> entry = info.entrySet();
		for(Entry<String,Integer> ent:entry)
		{
			if(ent.getValue()>1)
			{
				System.out.println(ent.getKey());
			}
		}
	}

}
