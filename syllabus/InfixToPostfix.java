import java.util.Scanner;

public class InfixToPostfix {

    static final int size = 100;
    static char[] stack = new char[size];
    static int top = -1;

    static void push(char c) {
        stack[++top] = c;
    }

    static char pop() {
        return stack[top--];
    }

    static int precedence(char c) {

        if (c == '^')
            return 3;

        if (c == '*' || c == '/')
            return 2;

        if (c == '+' || c == '-')
            return 1;

        return -1;
    }

    static void InfixToPostfix(String infix) {

        StringBuilder postfix = new StringBuilder();

        char ch;

        // Read expression character by character
        for (int i = 0; i < infix.length(); i++) {

            ch = infix.charAt(i);

            // Ignore spaces
            if (ch == ' ') {
                continue;
            }

            // If operand
            if (Character.isLetterOrDigit(ch)) {

                postfix.append(ch);

            }

            // If opening bracket
            else if (ch == '(') {

                push(ch);

            }

            // If closing bracket
            else if (ch == ')') {

                while (top != -1 && stack[top] != '(') {
                    postfix.append(pop());
                }

                pop(); // Remove '('
            }

            // If operator
            else {

                while (top != -1 &&
                       stack[top] != '(' &&
                       precedence(stack[top]) >= precedence(ch)) {

                    postfix.append(pop());
                }

                push(ch);
            }
        }

        // Empty the stack
        while (top != -1) {
            postfix.append(pop());
        }

        System.out.println("Postfix: " + postfix);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Expression:");

        String infix = sc.nextLine();

        InfixToPostfix(infix);

        sc.close();
    }
}