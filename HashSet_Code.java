import java.util.*;
public class HashSet_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);
        System.out.println("Initial Traversing: ");
        for(int i : set){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Initial Size: "+set.size());
        System.out.println("Set containing element (2): " + set.contains(2));
        set.remove(3);
        System.out.println("Set containing element (3): " +set.contains(3));
        set.remove(0);
        System.out.println("Size after removing elements: " + set.size());
        System.out.println("Traversing after all operations: ");
        for(int element : set){
            System.out.print(element+" ");
        }
        sc.close();
    }
}

/*
Output: 

Initial Traversing: 
1 2 3 4 
Initial Size: 4
Set containing element (2): true
Set containing element (3): false
Size after removing elements: 3
Traversing after all operations:
1 2 4
*/
