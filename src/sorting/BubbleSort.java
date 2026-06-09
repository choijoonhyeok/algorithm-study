package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        test(
            5,
            new int[]{5,2,3,4,1}
        );

        test(
            5,
            new int[]{5,4,3,2,1}
        );

        test(
            7,
            new int[]{10,-1,5,3,0,7,-5}
        );
    }

    static void test(int N, int[] arr) {

        System.out.println("===== TEST START =====");

        // 정렬
        //1. 비교연산이 필요한 루프범위 설정
        //2. 인접한 데이터 값을 비교한다.
        //3. swap 조건에 부합하면 swap을 실행한다.
        //루프가 끝날때까지 2~3 반복
        //정렬 영역을 설정한다. 다음 루프를 실행할 때는 이 영역을 제외한다.
        
        for(int i=arr.length-1;i>0;i--) {
        	for(int j=0;j<i;j++) {
        		
        		if(arr[j]>arr[j+1]) {
        			int t=arr[j];
        			arr[j] = arr[j+1];
        			arr[j+1]=t;
        		}
        		
        	}

        }
        for(int num :arr) {
    		System.out.print(num);
    		System.out.print(" ");
    	}
        System.out.println();
        
        

        // 출력

        System.out.println("===== TEST END =====");
        System.out.println();
    }
}