package leetcode;
import java.util.LinkedList;
import java.util.Arrays;
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        LinkedList<String> stack = new LinkedList<String>();
        int result;
        for (int i = 0; i < tokens.length; i++){
        	int operand1, operand2;
        	String interRel;
            if (tokens[i] == "+"){
                	operand1 = Integer.parseInt(stack.pop());
                	operand2 = Integer.parseInt(stack.pop());
                    interRel = Integer.toString(operand2 + operand1);
                    stack.push(interRel);
            }
            else if (tokens[i] == "-"){
                	operand1 = Integer.parseInt(stack.pop());
                	operand2 = Integer.parseInt(stack.pop());
                	interRel = Integer.toString(operand2 - operand1);
                    stack.push(interRel);
            }
            else if (tokens[i] == "*"){
                	operand1 = Integer.parseInt(stack.pop());
                	operand2 = Integer.parseInt(stack.pop());
                	interRel = Integer.toString(operand2 * operand1);
                    stack.push(interRel);
            }
            else if (tokens[i] == "/"){
                	operand1 = Integer.parseInt(stack.pop());
                	operand2 = Integer.parseInt(stack.pop());
                	interRel = Integer.toString(operand2 / operand1);
                    stack.push(interRel);
            }
            else{
                    stack.push(tokens[i]);
            }
        }
        result = Integer.parseInt(stack.pop());
        return result;
    }
    //test
    public void test(String[] tokens){
        int result = evalRPN(tokens);
        System.out.println(Arrays.toString(tokens) + " -> " + result);
    }
    public static void main(String[] args){
        String[] test1 = {"2", "1", "-", "3", "*"};
        String[] test2 = {"0", "3", "/"};
        EvaluateReversePolishNotation sol = new EvaluateReversePolishNotation();
        sol.test(test1);
        sol.test(test2);
    }
}

