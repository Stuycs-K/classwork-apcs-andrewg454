import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    String[] str = {"R2", "R2", "R2", "R2"};
      System.out.println(day1(str));
      System.out.println(data());
    }
  public static String[]data(){
    try{
      Scanner inf = new Scanner(new File("text.txt"));
      String line = inf.nextLine();
      System.out.println(line);
    }
    catch(Exception e){
      System.exit(1);
    }
    return null;
  }
public static int day1(String[] arr){
    int count = 0;
    int forward = 0;
    int backward = 0;
    int left = 0;
    int right = 0;
    int direction = 1;
    for (int i = 0; i < arr.length; i++){
      if(arr[i].contains("L")){
        if (direction == 1){
          direction = 4;
          left += Integer.parseInt(arr[i].substring(1));
          System.out.println("im adding" + Integer.parseInt(arr[i].substring(1)) + "to the left");
        }
        else{
          direction -= 1;
          if (direction == 1){
            forward += Integer.parseInt(arr[i].substring(1));
            System.out.println("im adding" + Integer.parseInt(arr[i].substring(1)) + "to the left");
          }
          if (direction == 2){
            right += Integer.parseInt(arr[i].substring(1));

            System.out.println("im adding" + Integer.parseInt(arr[i].substring(1)) + "to the left");
          }
          if (direction == 3){
            backward += Integer.parseInt(arr[i].substring(1));
          System.out.println("im adding" + Integer.parseInt(arr[i].substring(1)) + "to the left");}

        }}
        if(arr[i].contains("R")){
          if (direction == 4){
            direction = 1;
            forward += Integer.parseInt(arr[i].substring(1));
          }
          else{
            direction +=1;}
            if (direction == 2){
              right += Integer.parseInt(arr[i].substring(1));
            }
            if (direction == 3){
              backward += Integer.parseInt(arr[i].substring(1));
            }
            if (direction == 4){
              left += Integer.parseInt(arr[i].substring(1));
            }

          }
      }


//System.out.println(left + right + forward + backward);


  count += Math.abs(left-right);
  count += Math.abs(forward-backward);
  return count;}
}
