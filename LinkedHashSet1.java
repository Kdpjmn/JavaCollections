/*Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.

The important points about Java LinkedHashSet class are:

1.Java LinkedHashSet class contains unique elements only like HashSet.
2.Java LinkedHashSet class provides all optional set operation and permits null elements.
3.Java LinkedHashSet class is non synchronized.
4.Java LinkedHashSet class maintains insertion order.*/

import java.util.*;
class LinkedHashSet1{
  public static void main(String args[]){
    LinkedHashSet<String>s=new LinkedHashSet<String>();
    s.add("Kuldeep");
    s.add("Kuldeep");
    s.add("Kuldeep Jaiman");
    s.add("KDP");
    s.add("KJ");
     Iterator<String> i=s.iterator();  
   while(i.hasNext()){System.out.println(i.next());}
}
}


/*OUTPUT 
   
Kuldeep
Kuldeep Jaiman
KDP
KJ

*/
