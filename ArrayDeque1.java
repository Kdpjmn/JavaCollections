/*The ArrayDeque class provides the facility of using deque and resizable-array. It inherits AbstractCollection class and implements the Deque interface.

The important points about ArrayDeque class are:

1. Unlike Queue, we can add or remove elements from both sides.
2. Null elements are not allowed in the ArrayDeque.
3. ArrayDeque is not thread safe, in the absence of external synchronization.
4. ArrayDeque has no capacity restrictions.
5. ArrayDeque is faster than LinkedList and Stack.
*/

import java.util.*;
class ArrayDeque1{
  public static void main(String args[]){
  Deque <String>q=new ArrayDeque<String>();
    q.add("Kuldeep");
    q.add("Rajat");
    q.add("Nitesh");
    q.add("Anmol");
    q.add("Chetan");
    q.offerFirst("Sunil");//Adding at front 
    System.out.println("Queue elements:"+q);

    q.pollFirst();//removing first element
    q.pollLast();//removing last element
   System.out.println("After PollLast() :"+q);
 }
}
