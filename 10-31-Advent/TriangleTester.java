import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class TriangleTester {

  public static void main(String[] args){
   //System.out.println(countTrianglesA("inputTri.txt"));
    System.out.println(countTrianglesB("inputTri.txt"));
  }

  public static int countTrianglesA(String filename){
    try {
      File file = new File("inputTri.txt");
      Scanner input = new Scanner(file);
      int counter = 0;
      while (input.hasNextLine()){
        String currentLine = input.nextLine();
        String[] currentArray = new String[3];
        currentArray = currentLine.split(" ");
          if (checkTriangle(currentArray)){
            counter++;
          }
      }
      return counter;
    }  catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return 0; //you can return from a void function just don't put a value.
      }
  }

  public static boolean checkTriangle(String[] array){
    int[] intArray = new int[3];
    for (int i = 0; i < array.length; i++){
      intArray[i] = Integer.parseInt(array[i]);
    }
    return (intArray[0] + intArray[1] > intArray[2] && intArray[2] + intArray[1] > intArray[0] && intArray[0] + intArray[2] > intArray[1]);

    //return (Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2])) < (Integer.parseInt(array[0]) + Integer.parseInt(array[1]) + Integer.parseInt(array[2]) - Math.max(Integer.parseInt(array[0]), Integer.parseInt(array[1]), Integer.parseInt(array[2]))));
  }
 
  public static int countTrianglesB(String filename) {
        try {
            File file = new File("inputTri.txt");
            Scanner input = new Scanner(file);
            ArrayList<Integer> col1 = new ArrayList<>();
            ArrayList<Integer> col2 = new ArrayList<>();
            ArrayList<Integer> col3 = new ArrayList<>();
            while (input.hasNextLine()) {
                String currentLine = input.nextLine().trim();
                String[] currentArray = currentLine.split("\\s+");
                col1.add(Integer.parseInt(currentArray[0]));
                col2.add(Integer.parseInt(currentArray[1]));
                col3.add(Integer.parseInt(currentArray[2]));
            }
            int counter = 0;
            counter += countValidTriangles(col1);
            counter += countValidTriangles(col2);
            counter += countValidTriangles(col3);
            return counter;

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return 0;
        }
    }

    private static int countValidTriangles(ArrayList<Integer> column) {
        int counter = 0;
        for (int i = 0; i < column.size() - 2; i++) {
            int a = column.get(i);
            int b = column.get(i + 1);
            int c = column.get(i + 2);
            if (checkTriangle(a, b, c)) {
                counter++;
            }
            i+=2;
        }
        return counter;
    }

    private static boolean checkTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }}


//95