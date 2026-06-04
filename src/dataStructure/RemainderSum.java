package dataStructure;

public class RemainderSum {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(
                new int[]{1, 2, 3},
                3
        );

        // ===== 문제 2 =====
        test(
                new int[]{1, 2, 3, 1, 2},
                3
        );

        // ===== 문제 3 =====
        test(
                new int[]{4, 5, 0, 2, 3, 1},
                5
        );
    }

    static void test(int[] arr, int m) {

        System.out.println("===== TEST START =====");

        // ==========================
        int sumArr[] = new int [arr.length+1];
        sumArr[0] = 0;
        int answer=0;
        
        //배열 합 구하기
        for(int x=1;x<=arr.length;x++) {
        		sumArr[x] = sumArr[x-1]+arr[x-1]; 
        	
        }
        

        int reminder[]= new int [m];
        for(int z=1;z<=arr.length;z++) {
 
        	if(sumArr[z]%m==0) answer++;
        	reminder[sumArr[z]%m]++;

    }
        for(int count:reminder) {
        	answer += count*(count-1)/2;
        }
        
        System.out.println(answer);
       
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}