public class Wizard extends Adventurer{
    private static String specialName = "fireball";
    private static int specialDamage = 0;
    public static void main(String[] args){

    }
      //give it a short name (fewer than 13 characters)
  public abstract String getSpecialName(){
    return specialName;
  }

  //accessor methods
  public abstract int getSpecial(){
    return specialDamage;
  }
  public abstract void setSpecial(int n){
    specialDamage = n;
  }
  public abstract int getSpecialMax();

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other);

  //heall or buff the target adventurer
  public abstract String support(Adventurer other);

  //heall or buff self
  public abstract String support();

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);

  