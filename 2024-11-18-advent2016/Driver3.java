import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver3{
    public static void main(String[] args){
        String[] test = {"abba[mnop]qrst", "abcd[bddb]xyyx", "aaaa[qwer]tyui", "ioxxoj[asdfgh]zxcvbn"};
        System.out.println(Day7(test));
    }
    public static int Day7(String[] arr){
        boolean valid = true;
        int count = 0;
        for (int i =0; i<arr.length; i++){
            for(int z = 0; z<arr[i].length()-5; i++){
                String str = arr[i];
                if ((str.substring(z, z+1).equals("[")) && (str.substring(z+4, z+5).equals("]"))&&(str.charAt(z+1) != str.charAt(z+4))&&(str.charAt(z+2) == str.charAt(z+3))&&(str.charAt(z+1) != str.charAt(z+2))){
                    valid = false;
                }
                if ((str.charAt(z) == str.charAt(z+3)) && (str.charAt(z+1) == str.charAt(z+2)) && (str.charAt(z) != str.charAt(z+1))){
                    if (valid){
                    count+=1;}
                }
            }
        }
        return count;
    }
}