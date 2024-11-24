import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver3{
    public static void main(String[] args){
        String[] test = {"abba[mnop]qrst", "abcd[bddb]xyyx", "aaaa[qwer]tyui", "ioxxoj[asdfgh]zxcvbn", "abasioewn"};
        System.out.println(Day7(test));
    }
    public static int Day7(String[] arr){
    boolean valid = true;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        String str = arr[i];
        for (int z = 0; z < str.length() - 4; z++) { 
            if ((str.substring(z, z + 1).equals("[")) &&
                (str.substring(z + 5, z + 6).equals("]")) &&
                (str.charAt(z + 1) == str.charAt(z + 4)) &&
                (str.charAt(z + 2) == str.charAt(z + 3)) &&
                (str.charAt(z + 1) != str.charAt(z + 2))) {
                valid = false;
            }
        }
        for (int z = 0; z < str.length() - 3; z++) { 
            if ((str.charAt(z) == str.charAt(z + 3)) && 
                (str.charAt(z + 1) == str.charAt(z + 2)) && 
                (str.charAt(z) != str.charAt(z + 1))) {
                if (valid) {
                    count += 1;
                    System.out.println(str);
                }
            }
        }
    }
    return count;
}

}