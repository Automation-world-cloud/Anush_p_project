package JavaInt;

public class MissingNumberInAnArray {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,9};
		int f1 = findMissingNumber(a, 9);
		System.out.println(f1);
	}
	public static int findMissingNumber(int num[],int totalcount)
	{
		int expresult=totalcount*((totalcount+1)/2);
		int actualresult=0;
		for(int i:num)
		{
			actualresult=actualresult+i;
		}
		return expresult-
				actualresult;
	}

}
