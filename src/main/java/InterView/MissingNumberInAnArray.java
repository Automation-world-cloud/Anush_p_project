package InterView;

public class MissingNumberInAnArray {
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

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,7};
		int res = findMissingNumber(a, 7);
		System.out.println(res);
	}

}
