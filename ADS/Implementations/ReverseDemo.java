class ReverseD {
    Node start;

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack Push: Insert at the Beginning
    void push(int data) {
        Node n1 = new Node(data);
        n1.next = start;
        start = n1;
    }

    // Stack Pop: Remove from the Top
    void pop() {
        if (start == null) {
            System.out.println("Stack underflow !!");
            return;
        }
        start = start.next;
    }

    // Stack Peek: Top Element
    void peek() {
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print((char) start.data);
    }

    // Reverse a String Using Stack
    void reverse(String str) {
        int n = str.length();
        
        // Push characters onto stack
        for (int i = 0; i < n; i++) {
            this.push(str.charAt(i));
        }

        // Pop & print in LIFO order (Reversed)
        for (int i = 0; i < n; i++) {
            peek();
            pop();
        }
        System.out.println(); // New line for clarity
    }
}

// Driver Code
class ReverseDemo {
    public static void main(String[] args) {
        ReverseD r = new ReverseD();
        String s = "CDAC MUMBAI";
        r.reverse(s);
    }
}
