package dataStructure;
import java.util.*;

public class SlidingWindow2 {

    public static void main(String[] args) {

        test(
                new int[]{1,5,2,3,6,2,3,7,3,5,2,6},
                3
        );

        test(
                new int[]{4,2,12,3,5},
                2
        );

        test(
                new int[]{10,9,8,7,6},
                3
        );
    }

    static void test(int[] arr, int l) {

        System.out.println("===== TEST START =====");

        // -----------------------------------------
        Deque <Node> deque = new LinkedList<>();
        deque.add(new Node(0,arr[0]));
        System.out.print(deque.peekFirst().value);
        
        
        for(int i=1;i<arr.length;i++) {
        	
        	int now = arr[i]; 
        	
        	//1. 덱의 마지막 위치에서 now보다 큰값은 덱에서 제거
        	while(!deque.isEmpty() && deque.peekLast().value >now ) {
        		deque.removeLast();
        	}
        	
        	//2. 덱의 마지막 위치에 now값을 저장
        	
        	deque.addLast(new Node(i,arr[i]));
        	
        	//3. 덱의 1번째 위치에서부터 L의 벗어난 범위를 벗어난값 (index<=now index - L)제거
        	
        	if( deque.peekFirst().index <= i-l) {
        		deque.removeFirst();
        	}
        	
        	//4. 덱의 1번째 데이터 출력
        	System.out.print(deque.peekFirst().value);
        	
        	
        	//int now = Node.value();
        	
        	
        	
        }
        
        
        
        
        
        
        // -----------------------------------------

        System.out.println();
        System.out.println("===== TEST END =====");
        System.out.println();
    }
    
    static class Node{
    	public int index;
    	public int value;
    	
    	Node(int index,int value){
    		this.index = index;
    		this.value = value ;
    		
    	}
    	
    }
    
}