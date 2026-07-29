// import java.util.Stack;

import java.lang.reflect.Array;

public class basic {

    // stack using array

    int[] stack = new int[5];

        int top = -1;
        int length = 0;
        void push(int value){
                top++;
                stack[top] =value;
                length++;
        }

        int pop(){
            int val = stack[top];
            top--;
            length--;
            return val;

        }

        int peek(){
            return stack[top];
        }
        void printStack(int stack[]) {

            for(int i=0; i<= stack.length; i++) {
                System.out.print(stack[i] + " ");
                i++;
            }
        }

    public static void main(String[] args) {
        
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // System.out.println(stack);

        // System.out.println("Top : "+stack.peek());

        // System.out.println("element pop: " + stack.pop());

        // System.out.println(stack);


        // stack using array
        
        basic b = new basic();
        b.push(100);
        b.push(200);
        b.push(300);

        b.printStack(b.stack);

        System.out.println(b.peek());

        System.out.println(b.stack);
        
        System.out.println(b.pop());
        System.out.println(b.pop());

    }
}
