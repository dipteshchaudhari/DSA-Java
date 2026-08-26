import java.util.Scanner;

public class InfixToPrefix {

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

    static String InfixToPrefix(String infix) {

        // Step 1: Reverse the infix expression
        StringBuilder reverse = new StringBuilder();

        for (int i = infix.length() - 1; i >= 0; i--) {

            char ch = infix.charAt(i);

            if (ch == '(')
                reverse.append(')');
            else if (ch == ')')
                reverse.append('(');
            else
                reverse.append(ch);
        }

        // Step 2: Convert reversed expression to postfix
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < reverse.length(); i++) {

            char ch = reverse.charAt(i);

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
                       precedence(stack[top]) > precedence(ch)) {

                    postfix.append(pop());
                }

                push(ch);
            }
        }

        // Empty the stack
        while (top != -1) {
            postfix.append(pop());
        }

        // Step 3: Reverse postfix to get prefix
        return postfix.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Expression:");

        String infix = sc.nextLine();

        String prefix = InfixToPrefix(infix);

        System.out.println("Prefix: " + prefix);

        sc.close();
    }
}