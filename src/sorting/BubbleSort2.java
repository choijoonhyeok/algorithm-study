package sorting;

import java.util.*;

public class BubbleSort2 {

	static class Data{
		int value;
		int index ;
		public Data (int index,int value) {
			this.value=value;
			this.index=index;
			
		}
		
		
		
	}

    public static void main(String[] args) {

        test(
            5,
            new int[]{10,1,5,2,3}
        );
        
        test(
        	    5,
        	    new int[]{1,2,3,4,5}
        	);
        test(
        	    5,
        	    new int[]{5,4,3,2,1}
        	);
        test(
        	    7,
        	    new int[]{20,10,30,5,40,50,1}
        	);
        test(
        	    6,
        	    new int[]{1,3,2,4,6,5}
        	);
        test(
        	    8,
        	    new int[]{8,1,2,3,4,5,6,7}
        	);
        test(
        	    6,
        	    new int[]{3,3,2,2,1,1}
        	);
    }

    static void test(int N, int[] arr) {

        System.out.println("===== TEST START =====");

        // 1. value + 원래 index 저장
        Data beforSort[] = new Data[arr.length];
        
        for(int i=0;i<arr.length;i++) {
        	beforSort[i] = new Data(i,arr[i]);
        }
        Arrays.sort(beforSort,(a,b)->{
        	if(a.value==b.value) {
        		return a.index -b.index;
        	}
        	
        	
        	return a.value -b.value;});
        
        int max =0;
        for(int j=0;j<arr.length;j++) {
        	int differ = beforSort[j].index-j;
        	
        	if(differ>max) {
        		max=differ;
        	}
        	
   
        }
        System.out.println(max+1);


        System.out.println("===== TEST END =====");
    }
}