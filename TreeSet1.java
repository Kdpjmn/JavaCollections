/*Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface. The objects of the TreeSet class are stored in ascending order.

The important points about Java TreeSet class are:

1.Java TreeSet class contains unique elements only like HashSet.
2.Java TreeSet class access and retrieval times are quiet fast.
3.Java TreeSet class doesn't allow null element.
4.Java TreeSet class is non synchronized.
5.Java TreeSet class maintains ascending order.
*/

import java.util.*;
class TreeSet1{
 public static void main(String main[]){
    TreeSet<String>s=new TreeSet<String>();
    TreeSet<Integer>i=new TreeSet<Integer>();

     s.add("Kuldeep");
     s.add("Aman");
     s.add("Anuj");
     s.add("Rajat");
     s.add("Anuj");
     i.add(12);
     i.add(13);
     i.add(-1);
     i.add(0);
     i.add(12);
  
      //String
         System.out.println("Set of Strings: "+s);
         System.out.println("Reverse Set: "+s.descendingSet());  
         System.out.println("Head Set: "+s.headSet("Anuj", true));  
         System.out.println("SubSet: "+s.subSet("Kuldeep", false, "Rajat", true));  
         System.out.println("TailSet: "+s.tailSet("Anuj", false));  
     //Integer
          System.out.println("Set of Intergers: "+i);
          System.out.println("Lowest Value: "+i.pollFirst());  
          System.out.println("Highest Value: "+i.pollLast());  
}
}

/* OUTPUT:

Set of Strings: [Aman, Anuj, Kuldeep, Rajat]
Reverse Set: [Rajat, Kuldeep, Anuj, Aman]
Head Set: [Aman, Anuj]
SubSet: [Rajat]
TailSet: [Kuldeep, Rajat]
Set of Intergers: [-1, 0, 12, 13]
Lowest Value: -1
Highest Value: 13
*/
