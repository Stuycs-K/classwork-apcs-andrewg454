public class Wizard extends Adventurer{
    private static String specialName = "fireball";
    private static int specialDamage = 0;
    private static int specialResource = 1;
    public static void main(String[] args){

    }

  public Wizard(String name){
      this(name, 10);
  }

  public Wizard(String name, int hp){
      this.name = name;
      this.HP = hp;
      this.maxHP = hp;
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
  public abstract int getSpecialMax(){
    return specialDamage * 2;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other){
    other.setHP(other.getHP - 1);
  }

  //heall or buff the target adventurer
  public abstract String support(Adventurer other){
    other.setHP(other.getHP + 1);
  }

  //heall or buff self
  public abstract String support(){
    this.setHP(this.getHP + 1);
  }

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other){
    if(this.specialResource > 0){
    other.setHP(other.getHP - specialDamage);
    specialResource = specialResource-1;
    }

  }
}

  