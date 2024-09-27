public class MyArrays{
    public static string arrayToString(int[] nums){
        String endstring = "["
        for (int i =0; i< nums.length; i; i++){
            endString += nums[i];
            endString += ", ";}
        }
        endString += "]";
        return endstring.substring(0, endstring.length() -2);
    }
public static int[] returnCopy(int[]ary){
    int[] newArray = new int[ary.length()];
}
    public static void main(String[] args){
        int[] testArray = {1,2,3,4,5,6,10};
        System.out.println("result should be" + arrayToString(testArray) + ", actual result is " + arrayToString(returnCopy(testArray)))
        
    }
} 