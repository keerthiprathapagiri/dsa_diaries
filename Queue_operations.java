// Question: Demonstrate basic Queue operations in Java.
// Input: Queue elements = 1, 2, 3, 4, 5
// Output:
// [1, 2, 3, 4, 5]
// [2, 3, 4, 5]
// 2
// false
// 4

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();

        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);

        System.out.println(q1);

        q1.poll();
        System.out.println(q1);

        System.out.println(q1.peek());
        System.out.println(q1.isEmpty());
        System.out.println(q1.size());
    }
}