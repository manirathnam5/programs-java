class PowProgram{

 
  public static void main(String[] arg){
  
  
  //using while looop
  
    
	int base = 4, exponent = 5;
	
	long result = 1;
	
	
	while( exponent >0){
	
	  result *= base;
	 
	  --exponent;
	 
	 }
	 
	    System.out.println("Power of 4 is " + result);

        }
  }	  