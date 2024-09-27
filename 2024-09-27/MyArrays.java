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
    public static void main(String[] args){

    }
} 