import java.util.*;
public class HashMap_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map.put(6,7);
        map.put(6,7);
        System.out.println("Initial Traversing: ");
        for (Integer i : map.keySet())
            System.out.println("key: " + i + " ");
        System.out.println();
        for (Integer i : map.values())
            System.out.println("value: " + i + " ");

        System.out.println();
        System.out.println("Initial Size: "+map.size());
        System.out.println("Set containing element (2): " + map.containsKey(2));
        map.remove(3);
        System.out.println("Set containing element (3): " +map.containsKey(3));
        map.remove(0);
        System.out.println("Size after removing elements: " + map.size());
        System.out.println("Traversing after all operations: ");
        for (Integer i : map.keySet())
            System.out.print("key: " + i + " ");
        System.out.println();
        for (Integer i : map.values())
            System.out.print("value: " + i + " ");
        sc.close();
    }
}


/*
Output: 
Initial Traversing: 
key: 1   
key: 3   
key: 5   
key: 6   

value: 2 
value: 4 
value: 6 
value: 7

Initial Size: 4
Set containing element (2): false
Set containing element (3): false
Size after removing elements: 3
Traversing after all operations:
key: 1 key: 5 key: 6
value: 2 value: 6 value: 7
*/
