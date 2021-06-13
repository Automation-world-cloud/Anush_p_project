package Dummy;

public class PairAdd {
public static void main(String[] args) {
	int a[]= {3,4,7,6,9,1,8,2};
	pairAdding(a, 10);
	
}
public static void pairAdding(int num[],int number )
{
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
{
	if(num[i]+num[j]==number)
	{
		System.out.println(num[i]+" + "+num[j]+" = "+number);
	}
}
	}
}
}
