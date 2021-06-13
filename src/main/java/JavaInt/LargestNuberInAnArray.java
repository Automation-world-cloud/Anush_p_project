package JavaInt;

public class LargestNuberInAnArray {
	public static void main(String[] args) {
		int[] numbers= {20,30,12,14,143,101,45,1};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
			
		}
		System.out.println("Largest number is :"+largest);
		System.out.println("Smallest number is :"+smallest);
	}

}
