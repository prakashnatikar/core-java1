class ZomatoExecouter{
public static void main(String foodDilevery[]){
		
	System.out.println("main Started");
	double price = Zomato.search("gulam jamun");
	System.out.println("gulam jamun price is"+price);
	
	
	
	double amount = Zomato.search("gulam jamun",4);
	System.out.println("gulam jamun amount is"+price);
	
	
	
	System.out.println("main ended");
	}
}

