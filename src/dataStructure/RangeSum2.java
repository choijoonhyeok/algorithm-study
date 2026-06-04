package dataStructure;

public class RangeSum2 {

    public static void main(String[] args) {

        // ===== 문제 1 =====
        test(
//                new int[][]{
//                        {1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9, 1, 2, 3},
//                        {4, 5, 6, 7}
//                },
//                new int[][]{
//                        {1, 1, 2, 2},
//                        {2, 2, 4, 4},
//                        {1, 3, 3, 4}
//                }
                new int[][]{
                    {1, 2, 3, 4},
                    {2, 3, 4, 5},
                    {3, 4, 5, 6},
                    {4, 5, 6, 7}
            },
            new int[][]{
                    {2, 2, 3, 4},
                    {3, 4, 3, 4},
                    {1, 1, 4, 4}
            }
        );

        // ===== 문제 2 =====
        test(
                new int[][]{
                        {10, 20, 30},
                        {40, 50, 60},
                        {70, 80, 90}
                },
                new int[][]{
                        {1, 1, 3, 3},
                        {2, 2, 3, 3}
                }
        );

        // ===== 문제 3 =====
        test(
                new int[][]{
                        {7, 8},
                        {9, 10}
                },
                new int[][]{
                        {1, 1, 1, 1},
                        {1, 1, 2, 2},
                        {2, 1, 2, 2}
                }
        );
    }

    static void test(int[][] arr, int[][] query) {

        System.out.println("===== TEST START =====");

        // ==========================
        // 2차 배열 합
        int sumGraph[][] = new int [arr.length+1][arr[0].length+1]; 
        
        
        
        // 2차 배열합 만들기
        // sumGraph[i][j] =  sumGraph[i-1][j]+sumGraph[i][j-1]-sumGraph[i-1][j-1]+arr[i][j];
        for(int z=1;z<arr.length+1;z++) {
        	for(int x=1;x<arr[0].length+1;x++) {
        	sumGraph[z][x] =  sumGraph[z-1][x]+sumGraph[z][x-1]-sumGraph[z-1][x-1]+arr[z-1][x-1];
       
        	//System.out.print(sumGraph[z][x]+" ");
        	}
        	//System.out.println();
        }
        
        //계산하기
        //sumGraph[x2][y2]-sumGraph[x2][y1-1]-sumGraph[x1-1][y2]-sumGraph[x1-1][y1-1];
        
        for(int i=0;i<query.length;i++) {
        	int x1 = query[i][0];
        	int y1 = query[i][1];
        	int x2 = query[i][2];
        	int y2 = query[i][3];
        	System.out.println(sumGraph[x2][y2]-sumGraph[x2][y1-1]-sumGraph[x1-1][y2]+sumGraph[x1-1][y1-1]);
        }
        
        
        // ==========================

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}