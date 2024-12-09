import java.util.Scanner;
public class Game{
  public static void main(String[] args){
    CodeWarrior Andy = new CodeWarrior("Andy", 100, "Java");
    Wizard Enemy = new Wizard("Bob", 100);
    System.out.println(runLoop(Andy, Enemy));
  }
  public static String runLoop(CodeWarrior you, Wizard enemy){
    if(you.getHP() > 0){
      if (enemy.getHP() > 0){
        return "you have enough hp to begin";
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String response = userInput.nextLine();
        System.out.println("response is: " + response);

      }
      return "you have defeated the Wizard";
    }
    return "you don't have enough HP to begin";
  }
}
