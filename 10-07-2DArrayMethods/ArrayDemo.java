import java.util.Arrays;
public class ArrayDemo{
  public static void main(Str += ing[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
    String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
            endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String s = "[";
		for(int[] i : arr){
			s += arrayToString(i);
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
          counter +=1
        }
    }
  }
  return counter }

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
  public static String htmlTable(int[][]nums){
    return "";
  }
}
