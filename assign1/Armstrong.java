package week1.day1.assign1;

public class Armstrong {
	
	public static void main(String[] args) {
		

	int n = 154;
	int tmp = n;
	int r = 0;
	int sum = 0;
	

	while(n>0)
	{
	
		r=n%10;
		n=n/10;
		sum=sum + r*r*r;
		
	}
	
	if(tmp == sum)
		
		System.out.println("Armstrong number");
	else
		
		System.out.println("not a Armstrong number");	
}

}


