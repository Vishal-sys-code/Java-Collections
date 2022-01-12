import java.util.*;
public class DeQue_Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> aq = new ArrayDeque<Integer>();
        aq.addFirst(1);
        aq.addLast(2);
        aq.addFirst(3);
        aq.addFirst(4);
        System.out.println("Size:- " + aq.size());
        for(Integer i : aq){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Removing First Element: " + aq.removeFirst());
        System.out.println("Removing Last Element: " + aq.removeLast());
        sc.close();
    }
}

/*
OUTPUT: 

Size:- 4
4 3 1 2 
Removing First Element: 4
Removing Last Element: 2
*/