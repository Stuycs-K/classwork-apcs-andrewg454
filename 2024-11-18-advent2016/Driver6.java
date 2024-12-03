import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver6{
    public static void main(String[] args){
        System.out.println(readFile().toString());
    }
    public static String[] readFile(){
    try (Scanner inf = new Scanner(new File("text6.txt"));) {
            ArrayList<String> linesList = new ArrayList<String>();
            while (inf.hasNextLine()) {
               // System.out.println(inf.nextLine());
                linesList.add(inf.nextLine());
              //  System.out.println(linesList.toString());    
            }
            return (linesList.toArray(new String[0])); 
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return null;
        }
        }
        public static int day6(String[] str){
            ArrayList <String> one = new ArrayList<String>();
            ArrayList <String> two = new ArrayList<String>();
            ArrayList <String> three = new ArrayList<String>();
            ArrayList <String> four = new ArrayList<String>();
            ArrayList <String> five = new ArrayList<String>();
            ArrayList <String> six = new ArrayList<String>();
            ArrayList <String> seven = new ArrayList<String>();
            ArrayList <String> eight = new ArrayList<String>();
            for (int i = 0; i < str.lengthl < i++){
                
            }
        }
        public static String getMost(ArrayList <String> arrLst){
            int count = 0;
            int most = arrLst.get(0);
            for (int i = 0; i < arrLst.size(); i++){
                int count2 = 0;
                for (int j = 0; j < arrLst.size(), l++){
                    if(arrLst.get(i) == arrLst.get(j)){
                        count2++;
                    }
                    if (count < count2){
                        most = vals.get(i);
                        count = count2;
                    }
                }
            }
return most;
        }
}

