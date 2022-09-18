class Transport{
	
	static double travelling(String source,String destination)
	{
		System.out.println("Entered Source And Destination");
		if(source=="Hubli" && destination=="Bangalore")
	{
		System.out.println("Source= "+source+ " Destination= "+destination);
		return 455;
	}
		if(source=="Bangalore"  &&  destination=="Mysore")
	{
		System.out.println("Source= "+source +" Destination= "+destination);
		return 150;
	}
	
		if(source=="Hubli" && destination=="Haveri")
	{
		System.out.println("Source= "+source +" Destination= "+destination);
		return 85;
	}
		else
		System.out.println("no distance is calculated");
		return 0;
	}
 static double transport(String source,String destination, String ontime)
 {
	 System.out.println("entered transport which takes source destination and ontime");
	 if(ontime=="yes"){
		System.out.println("reached on time");
	 return 1;}
	 else
		 System.out.println("did not reach on time");
		 return 0;
 }
 
 
  static boolean transport( String destination){
	  System.out.println("entered transport which takes destination");
	   if(destination=="reached"){
		  System.out.println("destination reached");
	  return true;
	   }
	   if(destination=="not reached"){
		   System.out.println("destination not reached");
	   }
	   return false;
	 
  }
  
  
    static boolean transport(String destination, boolean ontime){
		System.out.println("entered transort which takes destination and ontime");
		System.out.println("destination is "+destination); 
		if(ontime==true){
		System.out.println("reached on time");
	 return true;}
	 if(ontime==false)
		 System.out.println("did not reach on time");
		 return false;
	}
	
	
		static boolean transport( boolean ontime){
		System.out.println("entered transport which takes ontime");
		
		if(ontime==true){
		System.out.println("reached on time");
	 return true;}
	 if(ontime==false)
		 System.out.println("did not reach on time");
		 return false;
		
	} 
		


		
		
}