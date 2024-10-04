package Daily_Programs.Stack.PredefinedStackClass;

import java.util.Stack;

public class Program1 {

    public static void main(String[] args) {
        
        Stack s = new Stack<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        s.add(60);

        System.out.println(s);

        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);

        System.out.println(s);

        s.pop();
        System.out.println(s.pop());
        System.out.println(s);

        s.peek();
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.empty());

        System.out.println(s.size());
    }
    
}