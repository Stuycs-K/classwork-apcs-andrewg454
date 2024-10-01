public class ArrayMethods{
	public static String arrayToString(int[] nums){
        String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
            endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}


	public static String arrayToString(int[][] arr){
		String s = "[";
		for(int[] i : arr){
			s += arrayToString(i);
			s += ", ";
		}
		s=s.substring(0, s.length() - 2);
		return s + "]";
	}
	public static void testarrayToString(){
		System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]" + " | " + arrayToString(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
	}
	public static int arr2DSum(int[][] nums){
		int sum = 0 ;
		for(int i = 0; i < nums.length; i++){
			for (int z = 0; z < nums[i].length; z++){
				sum += nums[i][z];
			}
		}
		return sum;
	}
	public static void testArr2DSum(){
		int [][] testArray = {{1, 2, 3, 4}, {10, 20, 30}, {25,5}};
		System.out.println("The result should be 100, and the result I got is " + arr2DSum(testArray));
		//idk how to test this
	}
	public static int[][] swapRC(int[][] nums) {
    	int rows = nums.length;
    	int columns = nums[0].length;
    	int[][] swapped = new int[columns][rows];
		for (int i = 0; i < rows; i++) {
        	for (int z = 0; z < columns; z++) {
            	swapped[z][i] = nums[i][z];
        	}
    	}
	return swapped;
}
	public static void testswapRC(){
		int [][] testArray = {{1, 2, 3, 4}, {10, 20, 30, 40}};
		System.out.println("The result should be [[1,10], [2, 20], [3, 30], [4, 40]] and the result I got is " + arrayToString(swapRC(testArray)));
	}

	public static void replaceNegative(int[][] vals){
		for(int i=0; i<vals.length; i++){
			for(int j=0; j<vals.length; j++){
				if(j==i){
					if(vals[i][j] < 0){
						vals[i][j] = 1;
					}
				}else{
					if(vals[i][j] < 0){
						vals[i][j] = 0;
					}
				}
			}
		}
	}
	public static int[] copyHelper(int[] arr){
		int[] copylst = new int[arr.length];
		for(int i=0; i<arr.length; i++){
			copylst[i] = arr[i];
		}
		return copylst;
	}
	public static int[][] copy(int[][] nums){
		int[][] copylst = new int[nums.length][];
	  for(int i=0; i<nums.length; i++){
			copylst[i] = copyHelper(nums[i]);
		}
		return copylst;
	}



	public static void main(String[] args){
		System.out.println("[1, 2, 3]" + " | " + arrayToString(new int[]{1, 2, 3}));
		testarrayToString();
		testArr2DSum();
		testswapRC();
		System.out.println("replaceNegative");
		int[][] arr10 = new int[][]{{-1, 2, 3}, {4, 5, -6}, {7, -8, 9}};
		replaceNegative(arr10);
		System.out.println("[[-1, 2, 3], [4, 5, -6], [7, -8, 9]] | expected: [[1, 2, 3], [4, 5, 0], [7, 0, 9]] | returned: " + arrayToString(arr10));


;;	}


}
