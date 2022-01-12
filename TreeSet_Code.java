import java.util.*;
public class TreeSet_Code {
    private static boolean remove;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<Integer>();
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
        System.out.println("Higher and Lower Methods: ");
        System.out.println(" Higher: " + set.higher(7));
        System.out.println(" Higher: " + set.higher(9));
        System.out.println(" Lower: " + set.lower(3));
        System.out.println("First and Last Methods: ");
        System.out.println(" First: "+ set.first());
        System.out.println(" Last: " + set.last());
        boolean remove = set.remove(set.higher(6));
        System.out.println(remove);
        System.out.println(set.higher(21));
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
Higher and Lower Methods:
 Higher: null
 Higher: null
 Lower: 2
First and Last Methods:
 First: 1
 Last: 4
Exception in thread "main" java.lang.NullPointerException
        at java.base/java.util.Objects.requireNonNull(Objects.java:208)
        at java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
        at java.base/java.util.TreeMap.remove(TreeMap.java:873)
        at java.base/java.util.TreeSet.remove(TreeSet.java:276)
        at TreeSet_Code.main(TreeSet_Code.java:32)
*/