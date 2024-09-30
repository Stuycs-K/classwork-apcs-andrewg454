public class ArrayMethods{
	public static String arrayToString(int[] nums){
        String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
        endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}
	public static int arr2DSum(int[][] nums){

	}	
	public static boolean testArr2DSum(int[][] nums){
		//idk how to test this
	}
	public static void main(String[] args){
		System.out.println("[1, 2, 3]" + " | " + arrayToString(new int[]{1, 2, 3}));
	}


}
