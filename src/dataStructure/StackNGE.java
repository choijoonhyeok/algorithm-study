package dataStructure;

import java.util.*;

public class StackNGE {

    public static void main(String[] args) {

        test(new int[]{3, 5, 2, 7});
        test(new int[]{9, 5, 4, 8});
        test(new int[]{1, 2, 3, 4, 5});
        test(new int[]{5, 4, 3, 2, 1});
        
        // 5 7 7 -1
        //-1 8 8 -1
        //2 3 4 5 -1
        //-1 -1 -1 -1 -1
    }

    static void test(int[] arr) {

        System.out.println("===== TEST START =====");

        // ==========================
        // 오큰수 
        // 1. 오른쪽에 있으면서 2. Ai 보다 큰수중 3. 가장 왼쪽에 있는 
        // 4. 만약 없으면 -1
        // stack? 선입후출 queue? 선입선출
        int answer[] = new int[arr.length];
        Stack <Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int i=1;i<arr.length;i++) {
        	int now =i ;

        	while(!stack.isEmpty()&&arr[stack.peek()] < arr[now] ) {
        		answer[stack.pop()]= arr[now];
        	}
        	
        	stack.push(now);
        	
        	
        	
        	
        		
        	
        	}
        while(!stack.isEmpty()) {
    		answer[stack.pop()] = -1;
    		
    	}

        	
        	
        	
        	// ==========================

            System.out.println("===== TEST END =====");
            System.out.println();
        	
        }
 
        
        
        
    }
