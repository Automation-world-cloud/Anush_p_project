package Dummy;

public class Scn1 {
	public static void main(String[] args) {
		int num[]= {-10,-12,-8,-6,-13,-13,-8};
		int highnum=Integer.MIN_VALUE;
		int sechighnum=Integer.MIN_VALUE;
		//System.out.println(Integer.MIN_VALUE);
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>highnum) {
				sechighnum=highnum;
				highnum=num[i];
			}
			if(num[i]<highnum && num[i]>sechighnum)
			{
				sechighnum=num[i];
			}
		
		}
		System.out.println(sechighnum);
	}

}
