class SpyNo

{
	public void calc()
	{
	
		for(int ip=0; ip<100000; ip++)
		{
			int a = ip;
			int z = ip;
			int sum = 0;
			int prod = 1;
			
			while(a>0)
			{
				int b = a%10;
				a = a/10;
				sum = sum + b;
				
			}
			while(z>0)	
			{

				int c = z%10;
				z = z/10;
				prod = prod*c;
				
			}	
			
			if(sum==prod)
			{
			
				System.out.println("Spy No." + ip);
			}
		}
	}
		
}



class MainSpy
{
	public static void main(String [] a)
	{
		SpyNo an = new SpyNo();
		an.calc();
	}
}
	