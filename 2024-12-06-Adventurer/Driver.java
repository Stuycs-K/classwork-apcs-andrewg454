public class Driver{
  public static void main(String[] args){
    Adventurer player1 = new Wizard("Steven", 100);
    Adventurer player2 = new Wizard("George", 100);
    System.out.print(player1.attack(player2));

  }
}