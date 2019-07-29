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


   
