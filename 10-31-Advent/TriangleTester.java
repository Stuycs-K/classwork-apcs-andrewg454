import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
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
  public static boolean checkTriangleB(int a, int b, int c){
    return (a + b >c && c + b > a && a + c > b);}
  public static int countTrianglesB(String filename){
    int count = 0;
    Scanner input = new Scanner(filename);
    int rowCount = 0;
            while (input.hasNextLine()) {
                input.nextLine();
                rowCount++;
            }
    input = new Scanner(filename);
    int[][] numbers = new int[rowCount][3];
    int ind = 0;
    while (input.hasNext()) {
        numbers[ind][0] = input.nextInt();
        numbers[ind][1] = input.nextInt();
        numbers[ind][2] = input.nextInt();
        ind++;
        }
    int numRows = rowCount / 3;
    for (int i = 0; i < numRows; i++) {
        int a = numbers[i][0];
        int b = numbers[i + numRows][1];
        int c = numbers[i + 2 * numRows][2];
    if (checkTriangleB(a, b, c)){
      count +=1;
    }}

return count;
}}

//95