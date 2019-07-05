public class ConditionalStatement {

  	public static void main(String[] args) {
    	int age = 24;
    	if(age > 20) {
      		System.out.println("Come in");
    	}
    
   		boolean isMale = true;
   		if(isMale) {    
    		System.out.println("You Male");
    	}
    	if(!isMale) {    
    		System.out.println("You Female");
    	}

    	double height = 1.9;
    	if(height < 1.8) {
      		System.out.println("Play football");
    	} else if(height > 1.8) {
      		System.out.println("Play basketball");
   		}

    	char firstLetter = "Alexander".charAt(0);
    	if(firstLetter == 'M') {  
     		System.out.println("Letter not found");
    	} else if(firstLetter == 'I') {
      		System.out.println("Letter not found");
   		} else if(firstLetter == 'A') {
      		System.out.println("Your name Alexander");
    	}
	}
}