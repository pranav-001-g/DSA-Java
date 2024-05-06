import java.util.Stack;

public class Stack_Add_At_last {
    static void addtolast(Stack<Integer> s, int target) {
        if (s.isEmpty()) {
            s.push(target);
            return;
        }
        int ele = s.pop();
        addtolast(s, target);
        s.push(ele);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int target = 90;
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);

        System.out.println(s);
        addtolast(s, target);

        System.out.println(s);
        System.out.println("---------------------------------------------------------------------");
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

}
