import java.util.*;
public class ArrayList_Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList L = new ArrayList(); //old non-generic arraylist
        ArrayList<Integer> list = new ArrayList<Integer>(); //new generic type
        list.add(2); //[2]
        list.add(3); //[2,3]
        list.add(7); //[2,3,7]
        list.add(5); //[2,3,7,5]
        list.set(1,4); //[2,4,7,5]
        list.remove(1); //[2,7,5]
        list.add(8); //[2,7,5,8]
        list.remove(list.size()-1); //[2,7,5]
        System.out.println(list.get(2)); //[5]
        System.out.println(list.isEmpty());
        //Traversing the List via While Loop
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println("Traversing via while loop: "+it.next());
        }
        //Traversing via for-each loop
        for(Integer i : list){
            System.out.println("Traversing via for-each loop: "+i);
        }
        sc.close();
    }
}