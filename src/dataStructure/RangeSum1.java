package dataStructure;

public class RangeSum1 {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(
                new int[]{5, 4, 3, 2, 1},
                new int[][]{
                        {1, 3},
                        {2, 4},
                        {5, 5}
                }
        );

        // ===== 문제 2 =====
        test(
                new int[]{10, 20, 30, 40, 50},
                new int[][]{
                        {1, 5},
                        {2, 3}
                }
        );

        // ===== 문제 3 =====
        test(
                new int[]{7, 8, 9},
                new int[][]{
                        {1, 1},
                        {1, 2},
                        {2, 3}
                }
        );
    }

    static void test(int[] arr, int[][] query) {

        System.out.println("===== TEST START =====");

        // ==========================
        // 여기부터 구현 (네가 작성)
        int sumArr[] = new int[arr.length+1];
        sumArr[0] = 0;

        for(int x=1; x<=arr.length;x++) {
        
        sumArr[x] = sumArr[x-1]+arr[x-1]; 
        //System.out.println(sumArr[x]);
        }
        
        //구간합 = sumArr[j]-sumArr[i-1]
        for(int z=0; z<query.length;z++) {
        	int i =query[z][0];
        	int j =query[z][1];
        	System.out.println(sumArr[j]-sumArr[i-1]);
        	
            }
        
        
      
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}