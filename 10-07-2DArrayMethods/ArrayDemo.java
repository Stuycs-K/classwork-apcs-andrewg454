import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    System.out.println("Test for SwapRC:");
    testswapRC();
    System.out.println("Test for Arr2DSum:");
    testArr2DSum();
    System.out.println("Test for arrToSring:");
    testarrToString();
    System.out.println("Test for arrToSring2D:");
    testarrToString2D();
    System.out.println("Test for ReplaceNegative:");
    testReplaceNegative();
    System.out.println("Test for CountZeros2D:");
    testCountZeros2D();
    System.out.println("Test for htmlTable:");
    testHtmlTable();
    System.out.println("Test for copy:");
    testCopy();

  }
  public static void testswapRC(){
		int [][] testArray = {{1, 2, 3, 4}, {10, 20, 30, 40}};
		System.out.println("The result should be [[1,10], [2, 20], [3, 30], [4, 40]] and the result I got is " + arrToString(swapRC(testArray)));
	}
  public static void testArr2DSum(){
  		int [][] testArray = {{1, 2, 3, 4}, {10, 20, 30}, {25,5}};
  		System.out.println("The result should be 100, and the result I got is " + arr2DSum(testArray));
      int [] [] testArray1 = {{-1, -2, -3, -4}, {10, 20, -30}, {25,5}};
      System.out.println("The result should be 20, and the result I got is " + arr2DSum(testArray1));
  	}
    public static void testarrToString2D(){
      int [][] testArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    		System.out.println("[[1, 2, 3], [4, 5, 6], [7, 8, 9]]" + " | " + arrToString(testArray));
    	}
      public static void testarrToString(){
      int [] testArray = {1, 3, 5, 7, 1110020};
    		System.out.println(Arrays.toString(testArray) + " | " + arrToString(testArray));
    	}
    public static void testReplaceNegative(){
        int[][] testArray = {{-1, 2, 3}, {4, 5, -6}, {7, -8, 9}};
        replaceNegative(testArray);
        System.out.println("Test case is [[-1, 2, 3], [4, 5, -6], [7, -8, 9]] | expected: [[1, 2, 3], [4, 5, 0], [7, 0, 9]] | returned: " + arrToString(testArray));
    }
    public static void testCountZeros2D(){
      int[][] testArray = {{-1, 0, 3}, {4, 5, -6}, {0, -8, 9}, {0, 0, 0, 0, 200, 403, 43}};
      System.out.println("The result should be 6, and my answer is " + countZeros2D(testArray));
    }
    public static void testHtmlTable(){
      int[][] testArray = {{-1, 0, 3}, {4, 5, -6}, {0, -8, 9}, {0, 0, 0, 0, 200, 403, 43}};
      System.out.println("The result should be <table><tr><td>-1</td><td>0</td><td>3</td></tr><tr><td>4</td><td>5</td><td>-6</td></tr><tr><td>0</td><td>-8</td><td>9</td></tr><tr><td>0</td><td>0</td><td>0</td><td>0</td><td>200</td><td>403</td><td>43</td></tr></table>, and my answer is " + htmlTable(testArray));
    }
    public static void testCopy()



  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String endstring = "[";
        for (int i =0; i< ary.length; i++){
            endstring += ary[i];
            endstring += ", ";}
            endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String s = "[";
		for(int[] i : ary){
			s += arrToString(i);
			s += ", ";
		}
		s=s.substring(0, s.length() - 2);
		return s + "]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int counter = 0;
    for (int i = 0; i < nums.length; i++){
      for (int z = 0; z < nums[i].length; z++){
				if(nums[i][z] == 0){
          counter +=1;
        }
    }
  }
  return counter; }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int sum = 0 ;
		for(int i = 0; i < nums.length; i++){
			for (int z = 0; z < nums[i].length; z++){
				sum += nums[i][z];
			}
		}
		return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
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

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
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

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"

    public static String htmlTable(int[][] nums) {
        String result = "<table>";
        for (int i = 0; i < nums.length; i++) {
            result += "<tr>";
            for (int z = 0; z < nums[i].length; z++) {
                result += "<td>" + nums[i][z] + "</td>";
            }
            result += "</tr>";
        }
        result += "</table>";
        return result;
    }
}
