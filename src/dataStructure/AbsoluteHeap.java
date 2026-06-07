package dataStructure;

import java.util.*;

public class AbsoluteHeap {

    public static void main(String[] args) {

    	test(
    		    18,
    		    new int[]{
    		        1,-1,0,0,0,1,1,-1,-1,2,-2,0,0,0,0,0,0,0
    		    }
    		);
    	
    	
        test(
            4,
            new int[]{1, -1, 0, 0}
        );

        test(
            8,
            new int[]{1, 1, -1, -1, 0, 0, 0, 0}
        );

        test(
            6,
            new int[]{2, -2, 3, 0, 0, 0}
        );
    }

    static void test(int N, int[] commands) {
    	Queue <Integer> queue = new PriorityQueue<>((o1,o2)->{
    		int first = Math.abs(o1);
    		int secound = Math.abs(o2);
    		
    		if(first==secound) {
    			return o1-o2;
    		}
    		else {
    			return first-secound;
    		}
    	});
    	

        System.out.println("===== TEST START =====");

        // 절댓값 힙 생성
        for(int i =0;i<N;i++) {
        	if(commands[i]==0) {
        		if(queue.isEmpty()) System.out.println("0");
        		else {
        			//절댓값이 가장 작은거를 출력
        			System.out.println(queue.poll());
        			}
        		}
        	else {
        		// 정해야할게 배열에 그냥 넣고
        		
        		queue.add(commands[i]);
        	}
        	
        	
        	
        }

    
        
        
        System.out.println("===== TEST END =====");
        System.out.println();
        }

        
    }
