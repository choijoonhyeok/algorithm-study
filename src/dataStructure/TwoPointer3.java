package dataStructure;

import java.util.*;

public class TwoPointer3 {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(new int[]{1, 2, 3, 4, 5});

        // ===== 문제 2 =====
        test(new int[]{1, 1, 2, 3});

        // ===== 문제 3 =====
        test(new int[]{0, 1, 2, 3, 4});

        // ===== 문제 4 =====
        test(new int[]{-1, 0, 1, 2, 3});
    }

    static void test(int[] arr) {

        System.out.println("===== TEST START =====");

        // ==========================
        //1. 정렬하기
        Arrays.sort(arr);
        
        //2.초기화
        int count =0;
        
        //3.좋은수 찾기
        for(int i=0;i<arr.length;i++) {
        	int k=arr[i];
        	int leftIndex=0;
            int rightIndex=arr.length-1;
            
        	
        	while(leftIndex<rightIndex) {
        		
        		if(leftIndex==i) {
        			leftIndex++;
        			continue;
        		}
        	
        		else if(rightIndex==i) {
        			rightIndex--;
        			continue;
        		}
        		
        		
        		
        		
        		if(arr[leftIndex]+arr[rightIndex]==k) {
//        			System.out.print(arr[leftIndex]);
//        			System.out.print(" ");
//        			System.out.print(arr[rightIndex]);
//        			System.out.print(" ");
//        			System.out.println(k);
        			
        			leftIndex++; rightIndex--;
        			count++;
        			break;
        		}
        		else if(arr[leftIndex]+arr[rightIndex]>k) {
        			rightIndex--;
        		}
        		else {
        			leftIndex++;
        		}
        		
        	}
        	//System.out.print(k);
        	
        }
        
        System.out.print(count);
        
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}