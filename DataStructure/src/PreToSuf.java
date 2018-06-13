import java.io.IOException;

class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int max) {
        maxSize = max;   //栈的最大容量
        stackArray = new char[maxSize];
        top = -1;
    }
    public void push(char j) {
        stackArray[++top] = j;
    }
    public char pop() {
        return stackArray[top--];
    }
    public char peek() {
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}
public class PreToSuf {
    private Stack s;
    private String input;
    private String output = "";

    public PreToSuf(String in) {
        input = in;
        int stackSize = input.length();
        s = new Stack(stackSize);
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1); break;
                case '*':
                case '/':
                    gotOper(ch, 2); break;
                case '(':
                    s.push(ch); break;
                case ')':
                    gotParen(ch); break;

                    default:
                        output = output + ch;
                        break;
            }
        }
        while (!s.isEmpty()) {
            output = output + s.pop();
        }
        return output;
    }

    public void gotOper(char opThis, int prec1) {
        while(!s.isEmpty()) {
            char opTop = s.pop();
            if (opTop == '(') {
                s.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    s.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        s.push(opThis);
    }

    public void gotParen(char ch) {
        while (!s.isEmpty()) {
            char chx = s.pop();
            if(chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String input = "1+2*(4+5)+3/6";
        String output;
        PreToSuf theTrans = new PreToSuf(input);
        output = theTrans.doTrans();
        System.out.println(output);
    }
}
