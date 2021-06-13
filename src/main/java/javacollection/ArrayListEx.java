package javacollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {
		
	
	Agent aa=new Agent(101, "Anush", "hyd");
	Agent ab=new Agent(101, "sai", "hyd");
	Agent ac=new Agent(101, "Reddy", "hyd");
	
	List<Agent> li=new ArrayList<Agent>();
	li.add(aa);
	li.add(ab);
	li.add(ac);
	//System.out.println(li);
	//foreach
	for(Agent a:li)
	{
		System.out.println(a.city+" "+a.id+" "+a.name);
	}
	System.out.println("---------------------------------------");
//iterator
	Iterator<Agent> it = li.iterator();
	while(it.hasNext())
	{
		Agent abc=it.next();
		System.out.println(abc.city+" "+abc.id+" "+abc.name);
	}
}
}