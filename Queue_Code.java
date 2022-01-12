import java.util.*;
public class Queue_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(1);
        System.out.println("Size of Queue after adding elements: " + queue.size());
        queue.poll();
        queue.add(5);
        System.out.println("Size of Queue after adding elements: " + queue.size());
        System.out.println("Peek of the queue: " + queue.peek());
        System.out.println("Checking for emptyness: " + queue.isEmpty());
        System.out.println("Checking if it contains: " + queue.contains(4));

        System.out.println("Queue Traversing via While LOOP");
        //traversing
        Iterator it = queue.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Stack Traversing via For-Each LOOP: ");
        for(Integer i : queue){
            System.out.print(i+" ");
        }
        queue.remove(3);
        System.out.println("Boolean Deleting: " + queue.remove(4));
        System.out.println("Size of Queue after deleting elements: " + queue.size());
        sc.close();
    }
}
