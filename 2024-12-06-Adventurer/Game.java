import java.util.Scanner;
public class Game{
  public static void main(String[] args){
    CodeWarrior Andy = new CodeWarrior("Andy", 10, "Java");
    Wizard Enemy = new Wizard("Enemy", 20);
    System.out.println(runLoop(Andy, Enemy));
  }
  public static String enemyTurn(CodeWarrior you, Wizard enemy){
    int rand = (int)(Math.random() * 3);
    //System.out.println(rand);
    if(rand == 0){
      return enemy.attack(you);
    }
    if(rand == 1){
      return enemy.specialAttack(you);
    }
    if(rand == 2){
      return enemy.support(enemy);
    }
    return null;
  }
  public static String runLoop(CodeWarrior you, Wizard enemy){
    System.out.println("you are a CodeWarrior starting with " + you.getHP() + " HP and your special ability is called " + you.getSpecialName() + " and costs 8 caffeine to cast");
    while(you.getHP() > 0){
      if (enemy.getHP() > 0){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
        String response = userInput.nextLine();
        //System.out.println("response is: " + response);
        if (response.equals("quit")){
          return "You Quit";
        }
        if (response.equals("a")){
          System.out.println(you.attack(enemy));
        }
        if (response.equals("sp")){
          System.out.println(you.specialAttack(enemy));
        }
        if (response.equals("su")){
          System.out.println(you.support(you));
        }        
        System.out.println(enemyTurn(you, enemy));
        System.out.println("One more turn has elapsed, you now have "+ you.getHP() + " HP and " + you.getSpecialResource() + " caffeine and your enemy has "+ enemy.getHP() + " HP and " + enemy.getSpecialResource()+ " special resource");
      }
      else{ return "you have defeated the Wizard";}
    }
    return "you don't have enough HP, you lose and the wizard wins";
  }}

