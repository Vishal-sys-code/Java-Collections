import java.util.*;
public class TreeMap_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();
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

        System.out.println();
        System.out.println("First and Last Entries: ");
        System.out.println(" First Entry: "  + map.firstEntry());
        System.out.println(" First Key:   "  + map.firstKey());
        System.out.println(" Last Entry: "  + map.lastEntry());
        System.out.println(" Last Key:  "  + map.lastKey());
        System.out.println();

        System.out.println("Higher and Lower Entries: ");
        System.out.println(" Higher Key: "  + map.higherKey(4));   
        System.out.println(" Lower Key: "  + map.lowerKey(4));
        map.remove(1);
        System.out.println(" Lower Key: "  + map.lowerKey(1));

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
First and Last Entries:
 First Entry: 1=2
 First Key:   1
 Last Entry: 6=7
 Last Key:  6

Higher and Lower Entries:
 Higher Key: 5
 Lower Key: 1
 Lower Key: null
*/
