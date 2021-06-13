package javacollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapProg {
public static void main(String[] args) {
	//FAIL FAST (CONCURRENT MODIFICATION EXCEPTION)
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(101, "Anush");
	m.put(102, "Sai");
	m.put(103, "Reddy");
	m.put(103,"kumar" );
	m.put(108, "reddy");//it does not maintain any insertion order if we put key as 108 it will maintain 108 only if we delete or add elemnets it wont change insertion order like array list
	System.out.println(m);
	System.out.println(m.get(101));
	//System.out.println(m.containsKey("103"));
	//System.out.println(m.keySet());
	//System.out.println(m.get(105));
	for(Entry list:m.entrySet())
	{
		System.out.println(list.getKey()+" "+list.getValue());
	}
	System.out.println(m.remove(103));
	System.out.println(m);
	
	
Map<Integer, Agent> mm=new HashMap<Integer, Agent>();
Agent a1=new Agent(10, "Anush", "Hyd");
Agent a2=new Agent(20, "sai", "bang");
Agent a3=new Agent(30, "Reddy", "chn");

mm.put(1,a1);
mm.put(2, a2);
mm.put(3, a3);

//traverse the HashMap
for(Entry<Integer,Agent> emp:mm.entrySet())
{
	int key = emp.getKey();
	Agent aa = emp.getValue();
	
	System.out.println("Employee "+key+"  info");
	
	System.out.println(aa.id+" "+aa.city+" "+aa.name);
	System.out.println("-------------------------");
}
}
}
