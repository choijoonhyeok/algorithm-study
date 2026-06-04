package dataStructure;

public class TwoPointer1 {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(15);

        // ===== 문제 2 =====
        test(10);

        // ===== 문제 3 =====
        test(5);

        // ===== 문제 4 =====
        test(1);
    }

    static void test(int n) {

        System.out.println("===== TEST START =====");
        System.out.println("N = " + n);

        // ==========================

       
        int startIndex=1;
        int endIndex=1;
        int sumIndex=1;
        int count=1;
        
        while(endIndex!=n) {
        	
        	if(n>sumIndex) {
        		endIndex++;
        		sumIndex+=endIndex;
        	}
        	
        	else if(n==sumIndex) {count++; endIndex++;sumIndex+=endIndex;}
        	else {
        		sumIndex-=startIndex;
        		startIndex++;
        		
        	}
        	
        	
        }
        
        
        
        System.out.println(count);
        
        
        
        
        
        
        
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}