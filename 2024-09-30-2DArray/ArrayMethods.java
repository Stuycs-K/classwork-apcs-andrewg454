public class ArrayMethods{
	public static String arrayToString(int[] nums){
        String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
            endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}


	public static String arr2DToStr(int[][] arr){
		String s = "[";
		for(int[] i : arr){
			s += arrayToString(i);
			s += ", ";
		}
		s=s.substring(0, s.length() - 2);
		return s + "]";
	}
	public static void testArr2DToStr(){
		System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]" + " | " + arr2DToStr(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
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
		System.out.println("The result should be [[1,10], [2, 20], [3, 30], [4, 40]] and the result I got is " + arr2DToStr(swapRC(testArray)));
	}
	public static void main(String[] args){
		System.out.println("[1, 2, 3]" + " | " + arrayToString(new int[]{1, 2, 3}));
		testArr2DToStr();
		testArr2DSum();
		testswapRC();
	}


}
