package JavaInt;

public class SecondHeighestNuber2 {
	public static void main(String[] args) {
		int[] num= {11,14,13,9,55,77};
		int highest=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>highest)
			{
				secondhighest=highest;
				highest=num[i];
			}
			else if(num[i]<highest && num[i]>secondhighest)
			{
				secondhighest=num[i];
			}
		}
		System.out.println(secondhighest);
	}

}
