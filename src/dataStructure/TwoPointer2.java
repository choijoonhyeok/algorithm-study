package dataStructure;

import java.util.*;

public class TwoPointer2 {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(
                new int[]{2, 7, 4, 1, 5, 3},
                9
        );

        // ===== 문제 2 =====
        test(
                new int[]{1, 2, 3, 4, 5, 6, 7},
                8
        );

        // ===== 문제 3 =====
        test(
                new int[]{1, 1, 1, 1, 1},
                2
        );

        // ===== 문제 4 =====
        test(
                new int[]{10, 20, 30, 40, 50},
                70
        );
    }

    static void test(int arr[] , int m) {

        System.out.println("===== TEST START =====");

        // ==========================
        Arrays.sort(arr);
        
        //초기화
        int lefttIndex = 0;
        int rightIndex = arr.length-1;
        int count =0;
        
        //투포인터
        while(lefttIndex<rightIndex) {
        	
        	if(arr[lefttIndex]+arr[rightIndex]==m) {
		
        		count++;
        		lefttIndex++;
        		 
        	}
        	else if(arr[lefttIndex]+arr[rightIndex]>m) {
        		rightIndex--;
        	}
        	else {
        		lefttIndex++;
        		
        	}
        	
        }
        
        
       System.out.print(count);
        
        

        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}