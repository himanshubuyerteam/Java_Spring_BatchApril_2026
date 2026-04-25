package Class4;

import java.util.*;
public class learColl {
    public static void main(String[] args) {
        // List<Integer>al=new List();
        // ArrayList<Integer>al=new ArrayList<Integer>();
        // List<Integer>al=new ArrayList<>();

        // al.add(10);
        // al.add(20);
        // al.add(30);
        // System.out.println(al.size());
        // System.out.println(al.get(1));
        // System.out.println(al.set(1,100));
        // System.out.println(al.get(1));

        // System.out.println(al);
        // System.out.println(al.remove(0));

        // System.out.println(al);

        LinkedList<Integer>ll =new LinkedList<>();
        // List<Integer>al=new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.addFirst(0);
        ll.add(2, 10);

        Stack<Integer>st=new Stack<>();

        // st.push(10);
        // st.push(30);
        // st.push(40);
        // System.out.println("Stack size is "+st.size());
        // int x= st.peek();
        // System.out.println(x);
        // System.out.println("Stack size is "+st.size());


        PriorityQueue<Integer>pq=new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(30);

        // System.out.println(pq.size());
        // System.out.println(pq.peek());
        // System.out.println(pq.poll());
        // System.out.println(pq.peek());

        PriorityQueue<Integer>maxPq=new PriorityQueue<>(Collections.reverseOrder());
        maxPq.add(10);
        maxPq.add(20);
        maxPq.add(30);
        System.out.println(maxPq.peek());
        System.out.println(maxPq.size());


    }
}
