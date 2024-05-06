import java.util.*;

public class Stack_By_ArrayList {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        void push(int a) {
            list.add(a);
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int ele = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return ele;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            int ele = list.get(list.size() - 1);
            return ele;
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(6);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }

}