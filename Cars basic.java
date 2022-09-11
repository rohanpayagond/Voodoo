class Cars{
	
	public static void main(String[] args)
	{
		
		int bmw=5000;
		int honda=4505;
		int porche=3689;
		int mahindra=4784;
		int maruti=8769;
		int tata=4578;
		int renault=6958;
		int lambo=9865;
		int volvo=7845;
		int benz=5498;
		
		int[] brands={bmw,benz,honda,porche,volvo,lambo,mahindra,renault,maruti,tata};
		int total=brands.length;
		System.out.println("total brands"+total);
		
		for(int all=0;all<brands.length;all++)
		{
			int ref=brands[all];
			System.out.println(ref);
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}