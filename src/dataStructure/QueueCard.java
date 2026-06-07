package dataStructure;

import java.util.*;

public class QueueCard {

    public static void main(String[] args) {

        test(1);
        test(2);
        test(4);
        test(6);
        test(7);
    }

    static void test(int n) {

        System.out.println("===== TEST START =====");

        // ==========================
        Queue <Integer> queue = new ArrayDeque<>();
        
        for(int i=1;i<=n;i++) {
        	queue.add(i);
        }
        
        //System.out.println(queue);
        //System.out.println(queue.poll());
        
        while(queue.size()>1) {
        	//1.queue 맨 앞에 있는 친구 버리기
        	queue.poll();
        	//        	
        	//2.queue 맨 앞에 친구를 뽑아서 뒤로 보내기

        	queue.add(queue.poll());
       	
        }
       
        System.out.println(queue.peek());

        
        
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}