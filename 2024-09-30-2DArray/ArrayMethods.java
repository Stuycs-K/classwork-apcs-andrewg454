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
			s += ", "
		}
		s=s.substring(0, s.length() - 2)
		return s + "]";
	}
	public static void testArr2DToStr(){
		System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]" + " | " + arr2DToStr(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
	}
	public static int arr2DSum(int[][] nums){
		return 0;
	}
	public static boolean testArr2DSum(int[][] nums){
		return false;
		//idk how to test this
	}
	public static void main(String[] args){
		System.out.println("[1, 2, 3]" + " | " + arrayToString(new int[]{1, 2, 3}));
		testArr2DToStr();
	}


}
