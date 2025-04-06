import java.util.*;

public class StackHackerrank{
    int stack[] = new int[100000];
    int top;

    public void top() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stack[top]);
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }

    public void push(int key) {
        top++;
        stack[top] = key;
    }

    public void size() {
        System.out.println(top + 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.top = -1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String sr = sc.next();
            if (sr.equals("TOP")) {
                s.top();
            } else if (sr.equals("POP")) {
                s.pop();
            } else if (sr.equals("SIZE")) {
                s.size();
            } else {
                int x = sc.nextInt();
                s.push(x);
            }
        }
    }
}
