import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> tester = createRandomArray(10);
    ArrayList<String> tester2 = createRandomArray(5);
    System.out.println(tester);
    //System.out.println(makeReversedList(tester));
    System.out.println(tester2);
    System.out.println(mixLists(tester, tester2));
  }
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> Arr = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      int temp = (int)(Math.random() * 11);
      Arr.add("" + temp);

    }
    replaceEmpty(Arr);
    return Arr;
  }
  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for(int i =0; i < original.size(); i++){
    if(original.get(i).equals("0")){
      original.set(i, "Empty");
    }
  }
  }
  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> Arr = new ArrayList<String>(original.size());
    for (int i = original.size() -1; i > 0; i--){
      Arr.add(original.get(i));}
      Arr.add(original.get(0));
    return Arr;
  }
  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> Arr = new ArrayList<String>(a.size() + b.size());
    for (int i = 0; i < Math.min(a.size(), b.size()); i++){
      Arr.add(a.get(i));
      Arr.add(b.get(i));
    }
    if (a.size() > b.size()){
      for(int i = b.size(); i < a.size(); i++){
        Arr.add(a.get(i));
      }
      }
      if (b.size() > a.size()){
        for(int i = a.size(); i < b.size(); i++){
          Arr.add(b.get(i));
        }
    }
return Arr;

    //return a new ArrayList that has all values of a and b in alternating order that is:
    //a[0], b[0], a[1], b[1]...
    //If one list is longer than the other, just attach the remaining values to the end.
  }
}
