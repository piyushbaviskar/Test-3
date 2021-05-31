package testLab.java;

import java.io.FileInputStream;

public class InBuiltExceptions {

	public static void main(String args[])
    /*{                                        //Divide by zero
        try {
            int a = 12, b = 0;
            int c = a / b; // cannot divide by zero
            System.out.println("result = " + c);
        }
        catch (ArithmeticException e) {
            System.out.println("not divide  by 0");
        }
    }*/
	
	
           /*{
		        try {
		            int a[] = new int[5];     //ArrayIndexOutOfBoundsException
		            a[6] = 12;  // size 5
		           
		        }
		        catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array Index is Out Of Bounds");
		        }*/
	
	
	
	
	/*{
        try {
            String a = null; // null value
            System.out.println(a.charAt(0));
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }*/
	
	
	
	{
        try {
            String a = "This is cdac mumbai Campus"; // length is 26
            char c = a.charAt(27); // accessing 27th element
            System.out.println(c);
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Accecssing 27 IndexOutOfBoundsException");
        }
    }

	
	
	
	
}

