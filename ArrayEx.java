package testLab.java;


import java.util.*;  



class ArrayEx{  
   public static void main(String args[]){  
      ArrayList<String> list=new ArrayList<String>();  
      list.add("Piyush");
      list.add("Nikhil");
      list.add("Raghav");
      list.add("Kunal");
      list.add("Pooja");
      list.add("Prajakta");
  
      
      System.out.println(list);
  
     
      list.add(5, "Nilesh");
  
      
      System.out.println(list);
   }  
}