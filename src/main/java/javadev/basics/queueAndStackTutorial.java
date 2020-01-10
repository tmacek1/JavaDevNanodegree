package javadev.basics;

import java.util.Stack;

public class queueAndStackTutorial {

    public static int calculate(String s) {

            /*
                Complete the calculator coding question.

                Give a string, and implement a calculator to evaluate a simple expression string.
                The expression string contains only non-negative integers, +, -, * operators.

                Example1: input “1+2”, output:3

                Example2: input “1+2*5”, output:11

             */

            int len;

            if (s == null || (len = s.length()) == 0) {
                return 0;
            }

            Stack<Integer> stack = new Stack<Integer>();
            int num = 0;
            char sign = '+';

            for (int i = 0; i < len; i++) {

                if (Character.isDigit(s.charAt(i))) {
                    num = Integer.parseInt(String.valueOf(s.charAt(i)));
                }

                if (!Character.isDigit(s.charAt(i)) || i == len - 1) {

                    switch(sign) {
                        case '-':
                            stack.push(-num);
                            System.out.println("current stack value: " + stack);
                            break;
                        case '+':
                            stack.push(num);
                            System.out.println("current stack value: " + stack);
                            break;
                        case '*':
                            //take top integer and multiply by current number in loop
                            stack.push(stack.pop() * num);
                            System.out.println("current stack value: " + stack);
                            break;
                    }

                    sign = s.charAt(i);
                    num = 0;
                }
            }

            int ans = 0;
            for (int i : stack) {
                ans += i;
            }

            System.out.println("result: " + ans);
            return ans;

        }

    public static void main(String[] args) {
        calculate("7*5+2+8+8-1");
    }

}
