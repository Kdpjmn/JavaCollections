//The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.

import java.util.*;
class PriorityQueue1{
 public static void main(String args[]) {
    PriorityQueue <String>q=new PriorityQueue<String>();
    q.add("Kuldeep");
    q.add("Rajat");
    q.add("Nitesh");
    q.add("Anmol");
    q.add("Chetan");

    System.out.println("Head :"+q.element()); //It is used to retrieves, but does not remove, the head of this queue. 
    System.out.println("Head :"+q.peek());  // t is used to retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.

System.out.println("Queue elements:"+q);
q.remove();//It is used to retrieves and removes the head of this queue.
q.poll();//It is used to retrieves and removes the head of this queue, or returns null if this queue is empty.
System.out.println("after removing two elements:"+q);
 }
}  
  

