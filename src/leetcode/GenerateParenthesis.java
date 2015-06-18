package leetcode;
import java.util.*;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list = new LinkedList<String>();
        recursive(list, n, 0, new StringBuilder());
        return list;
    }

    public void recursive(List<String> list, int n, int k, StringBuilder builder) {
        if (n == 0 && k == 0) {
            list.add(builder.toString());
        	System.out.println("n: " + n);
        	System.out.println("k: " + k);
            System.out.println(list.toString());
            System.out.println();
        }
        if (k > 0) {
        	System.out.println("n: " + n);
        	System.out.println("k: " + k);
            StringBuilder clone = new StringBuilder(builder);
            clone.append(')');
            System.out.println("clone: " + clone);
        	System.out.println();
            recursive(list, n, k - 1, clone);
        }
        if (n > 0) {
        	System.out.println("n: " + n);
        	System.out.println("k: " + k);
            builder.append('(');
            System.out.println("builder: " + builder);
        	System.out.println();
            recursive(list, n - 1, k + 1, builder);
        }
    }
    //test
    public static void main(String[] args){
    	GenerateParenthesis solution = new GenerateParenthesis();
    	List<String> list = solution.generateParenthesis(2);
    	System.out.println(list.toString());
    }
}
