
public class Lab3 {

	public static void main(String[] args) {
		
		
		float fahrenheit, centigrade;
		
		
		fahrenheit = 98.6f;	// casting 98.6 to float, (float)98.6
		
		centigrade = 5f/9 * (fahrenheit-32);	//5/9 =>0
		
		// fahrenheight+=5;  => fahrenheit=fahrnheit+5;
		
		
		System.out.println("Fahranheit : "+fahrenheit+ " Centigrade : "+centigrade);
		
		for (fahrenheit=0; fahrenheit <=40; fahrenheit+=5) {
		
			centigrade = 5f/9 * (fahrenheit-32);
		
		System.out.println("Fahranheit : "+fahrenheit+ " Centigrade : "+centigrade);

	}
	
	
	
	System.out.println("Fahranheit : "+fahrenheit);
	
	fahrenheit = 0;
	while (fahrenheit <=40) {
		
		centigrade = 5f/9 * (fahrenheit-32);
		
		System.out.println("Fahranheit : "+fahrenheit+ " Centigrade : "+centigrade);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
