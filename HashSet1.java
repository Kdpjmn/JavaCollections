/*Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.
*/

import java.util.*;


class Player 
{
   int tshirtno;
   String name,sports;
   
   public Player(int tshirtno,String name,String sports)
   {
      this.tshirtno=tshirtno;
      this.name=name;
      this.sports=sports;
   }
}

public class HashSet1{
   public static void main(String args[])
    {
       HashSet<Player> p=new HashSet<Player>();
       Player p1=new Player(17,"KJ","Cricket");
       Player p2=new Player(17,"KJ","Cricket");
       Player p3=new Player(19,"AJ","Cricket");
       Player p4=new Player(17,"KJ","TT");
     
       p.add(p1);
       p.add(p2);
       p.add(p3);
       p.add(p4);

     for(Player Pl:p){
       System.out.println(Pl.name+"\t"+Pl.sports+"\t"+Pl.tshirtno);}  

 }
}

