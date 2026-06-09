package sorting;

import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {

        test("2143");
        test("999998999");
        test("123456789");
        test("10200");
        test("54321");
    }

    static void test(String number) {

        System.out.println("===== TEST START =====");

        // ==========================
        
        // 여기에 구현
        
        String arr[] = number.split("");
        int arrInt[] = new int [arr.length];
        int answer[]= new int [arr.length];
        
        for(int i=0;i<arr.length;i++) {
        	arrInt[i] = Integer.parseInt(arr[i]);
        }
        
        //내림차순 정렬하기
       
        
        
        
      //1. 범위를 설정
        for(int x=0;x<arrInt.length;x++) {
        	
        	//2. 범위중에서 제일 큰거를 선택
        	 int max=x;
        	
        	 
        	for(int j=x+1;j<arrInt.length;j++) {
        		if(arrInt[max]<arrInt[j]) {
        			max= j;
        		}        		
        	}
        
        	//3. 맨 왼쪽에 두기 
        int t = arrInt[x];
        arrInt[x] =  arrInt[max];
       	arrInt[max]=t;
        
        }
        
        for(int a : arrInt) {
        	System.out.print(a);
        }
       
        // ==========================

        System.out.println();
        System.out.println("===== TEST END =====");
        System.out.println();
    }
}