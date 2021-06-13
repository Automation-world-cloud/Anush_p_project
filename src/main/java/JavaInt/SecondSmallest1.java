package JavaInt;

public class SecondSmallest1 {
public static void main(String[] args) {
	int[] a= {21,13,15,17,3,15};
	int temp;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		//System.out.print(a[i]+" ");
		
	}
	System.out.println("second smallest number is:"+a[1]);
	
}
}
