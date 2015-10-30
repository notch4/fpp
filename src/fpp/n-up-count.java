set 1  . Q.No 2

public static int nUpCount(int[] a, int n){
		
		int counter = 0;
		int[] partialSumArray = new int[a.length];
		int partialSum = 0;
		
		for(int i = 0; i<a.length; i++){
			
			partialSum += a[i];
			
			System.out.println(partialSum); // this line is just for test
			
			partialSumArray[i] = partialSum;
			
			if(partialSum > n && partialSumArray[i-1] <= n){
				counter++;
				System.out.println("here"); // this line is just for test
			}
			
		}
		
		return counter;
	}
