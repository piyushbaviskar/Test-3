package testLab.java;

class ExcBank extends Exception{  
	ExcBank(String s){  
	  super(s);  
	 }  
	}  
	class Exception1{  
	  
	   static void validate(int balance)throws ExcBank{  
	     if(balance<1000)  
	      throw new ExcBank("Unsufficient balance");  
	     else  
	      System.out.println("Withdraw");  
	   }  
	     
	   public static void main(String args[]){  
	      try{  
	      validate(200);  
	      }catch(Exception m){System.out.println("Exception occured: "+m);}  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  