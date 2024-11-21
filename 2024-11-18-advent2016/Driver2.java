import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver2{
  public static void main(String[] args){
    System.out.println(Day2(data()));
    System.out.println(data());
  }
  public static String data(){
    try{
      Scanner inf = new Scanner(new File("text2.txt"));
      String line = "";
       line += inf.nextLine();
      System.out.println(line);
      return line;

    }
    catch(Exception e){
      System.exit(1);
    }
    return null;
  }
  public static String Day2(String str){
    //String code = "";
    String[][] keyPad =
    {{"1", "2", "3"}
    ,{"4", "5", "6"}
    ,{"7", "8", "9"}
    };
    int row = 1;
    int column = 1;
    for (int i = 0; i< str.length(); i++){
      if (str.charAt(i) == 'U' && row > 0){
        row--;
      }
      if (str.charAt(i) == 'D' && row < 2){
        row++;
      }
      if (str.charAt(i) == 'L' && column > 0){
        column--;
      }
      if (str.charAt(i) == 'R' && column < 2){
        column++;
      }
    }
    return (keyPad[row][column]);
  }
}
