import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    public static int countTrianglesA(String filename){
      try {
        File file = new File("inputTri.txt");
        Scanner input = new Scanner(file);
        ArrayList<String> str = new ArrayList<String>();
        while (input.hasNextString()) {
          str.add(input.nextString());
}
        }
        catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return 0; //you can return from a void function just don't put a value.
      }
    }
  }
  public static int day1(Arimport java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;ray arr){
    int count = 0;
    int forward = 0;
    int backward = 0;
    int left = 0;
    int right = 0;
    int direction = 1;
    for (int i = 0; i < arr.length(); i++){
      if(arr[i].has("L")){
        if (direction == 0){
          direction = 4;
          left += parseInt(arr[i].substring(1));
        }
        else{
          direction -= 1;
          if (direction == 1){
            forward += parseInt(arr[i].substring(1));
          }
          if (direction == 2){
            right += parseInt(arr[i].substring(1));
          }
          if (direction == 3){
            backward += parseInt(arr[i].substring(1));
          }
        }
        if(arr[i].has("R")){
          if (direction == 4){
            direction = 1;
            forward += parseInt(arr[i].substring(1));
          }
          else{
            direction +=1;
            if (direction == 2){
              right += parseInt(arr[i].substring(1));
            }
            if (direction == 3){
              backward += parseInt(arr[i].substring(1));
            }
            if (direction == 4){
              left += parseInt(arr[i].substring(1));
            }

          }
      }

    }
  }
  count += Math.abs(left-right);
  count += Math.abs(forward-backward);
  return count;}
}
