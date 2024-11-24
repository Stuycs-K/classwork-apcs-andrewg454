import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver7{
    public static void main(String[] args){
      //  System.out.println((readFile("text7.txt")).toString());
        System.out.println(Day7(readFile("text7.txt")));
     //String[] test = {"luqpeubugunvgzdqk[jfnihalscclrffkxqz]wvzpvmpfiehevybbgpg[esjuempbtmfmwwmqa]rhflhjrqjbbsadjnyc"};
     //   System.out.println(Day7(test));
    }
    public static String[] readFile(String fileName) {
    try (Scanner inf = new Scanner(new File(fileName));) {
            ArrayList<String> linesList = new ArrayList<String>();
            while (inf.hasNextLine()) {
                linesList.add(inf.nextLine());
              //  System.out.println(linesList.toString());    
            }
            return (linesList.toArray(new String[0])); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
        }
     //   String[] test = {"abba[mnop]qrst", "abcd[bddb]xyyx", "aaaa[qwer]tyui", "ioxxoj[asdfgh]zxcvbn", "abasioewn"};
      //  System.out.println(Day7(test));
    public static int Day7(String[] arr){
    boolean valid = true;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        String str = arr[i];
        for (int z = 0; z < str.length() - 6; z++) { 
            if (str.substring(z, z + 1).equals("[")){
                int indx = str.substring(z).indexOf("]");
                System.out.println(indx +z);
                for(int k = z; k < indx + z; k++){
                    if((str.charAt(k + 1) == str.charAt(k + 4)) &&
                (str.charAt(k + 2) == str.charAt(k + 3)) &&
                (str.charAt(k + 1) != str.charAt(k + 2))){
                valid = false;
                System.out.println("change");
                }
                }
            }
            //&&
                //(str.substring(z + 5, z + 6).equals("]")) &&
              //  (str.charAt(z + 1) == str.charAt(z + 4)) &&
              //  (str.charAt(z + 2) == str.charAt(z + 3)) &&
               // (str.charAt(z + 1) != str.charAt(z + 2))) {
              //  valid = false;
               // System.out.println("change");
          //  }
           // System.out.println(str.substring(z, z + 1));
          //  System.out.println(str.substring(z + 5, z + 6));
        }
        for (int z = 0; z < str.length() - 3; z++) { 
            if ((str.charAt(z) == str.charAt(z + 3)) && 
                (str.charAt(z + 1) == str.charAt(z + 2)) && 
                (str.charAt(z) != str.charAt(z + 1)) &&
                valid == true
                ) { System.out.println(str.substring(z, z+4));
                    count += 1;
                    System.out.println(str);
                    z+= str.length()-z;
            }
        }
         valid = true;
    }
    return count;
}

}