import java.util.*;

public class LinkedList1{
    
    public static void main(String args[]) {
     
       LinkedList<String>ll=new LinkedList<String>();
       ll.add("Kuldeep");
       ll.add("Anuj");    
       ll.add("Aman");
       ll.add("Abhishek");
       ll.add("Kuldeep");
       ll.add("Shashank"); 
      System.out.println("List of Elements : "+ll); 

   //Adding an element at specific position
       ll.add(1,"Jai");
      System.out.println("Updated List : "+ll);
 
  //Removing element on the basis of specific position
       ll.remove(1);       
      System.out.println("After remove() method : "+ll);
   //Remove all the elements
     ll.clear();
           System.out.println("After clear() method: "+ll);
   
   }
}
