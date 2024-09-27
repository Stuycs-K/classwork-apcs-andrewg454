public class MyArrays{
    public static String arrayToString(int[] nums){
        String endstring = "[";
        for (int i =0; i< nums.length; i++){
            endstring += nums[i];
            endstring += ", ";}
        endstring = endstring.substring(0, (endstring.length() - 2)) + "]";
        return endstring;}
public static int[] returnCopy(int[]ary){
    int[] newArray = new int[ary.length];
    for(int i =0; i<ary.length; i++){
        newArray[i] = ary[i];
    }
    return newArray;
}
public static int[] concatArray(int[]ary1,int[]ary2){
        int[] result = new int[nums.length];
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
            result[index] = ary1[i];
            index++;
    }
    for (int i = 0; i < nums.length; i++) {
            result[index] = ary2[i];
            index++;
    }

    return result;
}

}
    public static void main(String[] args){
        int[] testArray = {1,2,3,4,5,6,10};
        int[] testArray2 = {2, 4, 6, 8, 100};
        System.out.println("result should be" + arrayToString(testArray) + ", actual result is " + arrayToString(returnCopy(testArray)));
        System.out.println("They aren't the same because the test array's address is " +  testArray + " and the address of the function array is " + returnCopy(testArray));
        System.out.println(arrayToString(concatArray(testArray, testArray2)));
    }
} 