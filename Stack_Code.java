import java.util.*;
public class Stack_Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();

        s.push(1);
        s.push(13);

        //traversing
        Iterator it = s.iterator();
        System.out.println("Stack Traversing via While LOOP");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // System.out.println("Top of Stack after Pushing: " + s.top());
        System.out.println("Size of Stack after Pushing: " + s.size());
        System.out.println("Popping the element: " + s.pop());
        System.out.println("Peeking the element in stack after deleting: " + s.peek());
        System.out.println("Popping the element: " + s.pop());
        System.out.println("Size of Stack after Poping: " + s.size());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(1);
        System.out.println("Size of Stack after Pushing: " + s.size());
        System.out.println("Peeking the element in stack after oushing new elements: " + s.peek());
        System.out.println("Checking if the stack is empty or not:  " + s.peek());
        System.out.println("Checking if the stack contains 4 or not:  " + s.contains(4));
        System.out.println("Searching the element:2 in the stack:  " + s.search(2));
        System.out.println("Stack Traversing via For-Each LOOP: ");
        for(Integer i : s){
            System.out.print(i+" ");
        }
        sc.close();
    }
}