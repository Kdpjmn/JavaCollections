/*ArrayList class uses a dynamic array for storing the elements. It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In Java ArrayList class, manipulation is slow because a lot of shifting needs to occur if any element is removed from the array list.
*/
import java.util.*;
import java.util.List;



class player
{
   String name,sport;
   int tshirt;
   
   public player(String name,String sport,int tshirt)
    {
       this.name=name;
       this.sport=sport;
       this.tshirt=tshirt;
    }
}

public class ArrList{
public static void main(String args[]){
 //Creating list of players 
  List<player>l=new LinkedList<player>();
 //Creating players
   player p1=new player("Kuldeep","Cricket",17);
   player p2=new player("Rajat","TT",18);
   player p3=new player("Nitesh","Carrom",19);
//Adding playes to the list

   l.add(p1);
   l.add(p2);
   l.add(p3);

//Traversing List
   
      Iterator i=l.descendingIterator();  
           while(i.hasNext())  
           {  
               System.out.println(i.next());  
           }  


 // for(player p:l){System.out.println(p.name+"\t"+p.sport+"\t"+p.tshirt);}
}
}


   
