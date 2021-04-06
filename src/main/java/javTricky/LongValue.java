package javTricky;

public class LongValue {
	
	//what will be the output when we us Long with L and Long without L as suffix?

	public static void main(String[] args) {
		
		long woL=1000*60*60*24*365;
		System.out.println(woL);
		long wL=1000*60*60*24*365l;
		System.out.println(wL);
	}
}
