import java.util.*;
public class PriorityQueue_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(1);
        System.out.println("Traversing the Priority Queue: ");
        for(int i : pq){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Peek most element of the Priority Queue: " + pq.peek());
        pq.poll();
        pq.poll();
        System.out.println("Size of the Priority Queue by removing elements: "+pq.size());
        sc.close();
    }
}

/*
Output: 

Traversing the Priority Queue: 
1 1 3 4 2 
Peek most element of the Priority Queue: 1
Size of the Priority Queue by removing elements: 3
*/
