package dataStructure;

import java.util.*;

public class StackSequence {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(new int[]{
                4, 3, 6, 8, 7, 5, 2, 1
        });

        // ===== 문제 2 =====
        test(new int[]{
                1, 2, 5, 3, 4
        });

        // ===== 문제 3 =====
        test(new int[]{
                2, 1, 4, 3, 6, 5
        });

        // ===== 문제 4 =====
        test(new int[]{
                3, 1, 2
        });
    }

    static void test(int[] target) {

        System.out.println("===== TEST START =====");

        // ==========================
        Stack<Integer> stack = new Stack<>(); 
        int num =1;
        
        StringBuilder sb = new StringBuilder();
        
        boolean answer = true;
        
        for(int i=0;i<target.length;i++) {
        	
        	int now = target[i];
        	
        	if(stack.isEmpty()||stack.peek()<now) {
        		
        			while(num<=now) {
        				
            			stack.push(num);
            			num++;
            			sb.append("+");
            			//System.out.println(stack);
            		}

        	}
        	
        	if(stack.isEmpty() ||stack.peek() > now) {
        		answer = false;
        	    break;
        	}
        	
        	if(stack.peek()==now) {
        		stack.pop();
        		sb.append("-");
        		
        	}
        	
        
        }
        
        if(answer==true) {
        	System.out.println(sb.toString());
        }
        else System.out.println("NO");
        
        
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}