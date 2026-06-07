package dataStructure;
//import java.util.*;


public class SlidingWindow1 {
	
	

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(
                "ACGTACGT",
                4,
                new int[]{1, 1, 1, 1}
               
        );

        // ===== 문제 2 =====
        test(
                "AAAAACCC",
                4,
                new int[]{2, 1, 0, 0}
        	
        );

        // ===== 문제 3 =====
        test(
                "AGCTAGCT",
                3,
                new int[]{1, 0, 1, 0}
        );

        // ===== 문제 4 =====
        test(
                "AACCGGTT",
                5,
                new int[]{2, 1, 1, 1}
        );
    }

    static void test(String dna,
                     int p,
                     int[] required) {

        System.out.println("===== TEST START =====");

        // ==========================
       
        //1. 초기화
        int count=0;
        int dnaArr[] = new int [4];
       
        String part = dna.substring(0,p);
       
        for(int z=0;z<p;z++) {
        	char now = part.charAt(z);
        	
        	if(now=='A') {dnaArr[0]+=1;}
        	else if(now=='C') {dnaArr[1]+=1;}
        	else if(now=='G') {dnaArr[2]+=1;}
        	else {dnaArr[3]+=1;}
        }
                
        
        //2. 찾기
        for(int i=0;i+p-1<dna.length();i++) {
        	
        	  
        	//확인하기
        	int correct=0;
        	for(int j=0;j<4;j++) {
        		
            	if(dnaArr[j]>=required[j]) correct+=1;
            }

        	if(correct==4) count++;
        	
        	//1.맨앞에 있는거 삭제하고 업데이트

        	if(dna.charAt(i)=='A') {dnaArr[0]-=1;}
        	else if(dna.charAt(i)=='C') {dnaArr[1]-=1;}
        	else if(dna.charAt(i)=='G') {dnaArr[2]-=1;} 
        	else {dnaArr[3]-=1;}
        	
        	//2.현재 에서 +1 한값 업데이트
        	
        	if(i+p<dna.length()) {
        		if(dna.charAt(i+p)=='A') {dnaArr[0]+=1;}
                else if(dna.charAt(i+p)=='C') {dnaArr[1]+=1;}
                else if(dna.charAt(i+p)=='G') {dnaArr[2]+=1;}
                else {dnaArr[3]+=1;}
        		
        		
        	}
        		
        	
        }
        	

        	
        	
        	 System.out.println(count);
        	

        
        
        
        
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}