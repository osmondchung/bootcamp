package hero;
import java.math.BigDecimal;

public abstract class Hero {
  private static int idCounter = 0;

  private int id;
  private int level;
  private int hp;
  private int mp;
  private double exp;

  // Constructor
  public Hero() {
      this.id = ++idCounter;
      this.level = 1;   // Hero starts at level 1
      this.hp = Heros.MAX_HP[0];
      this.mp = Heros.MAX_MP[0];
  }

  public void levelUp(){
    this.level++;
    this.recoverHp();
    this.recoverMp();
    this.exp = 0.0; // reset exp to 0 after leveling up
  }

  public void recoverHp(){
    this.hp = Heros.MAX_HP[this.level - 1];
  }

  public void recoverMp(){
    this.mp = Heros.MAX_MP[this.level - 1];
  }

  // method for calculating hero HP after taking damage
  public void deductHp(int deductedHp){
    this.hp = Math.max(this.hp - deductedHp, 0); // return ppositive hp is still alive, otherwise 0 if dead
  }

  public void attack(Hero hero){
    int deductedHp = Math.max(this.getPa() - hero.getPd(), 0);
    hero.deductHp(deductedHp); // this hero. deducts his hp by the physical attack
    if (!hero.isAlive()){
      double addedExp = Heros.calcAddedExp(hero.getLevel());
      this.exp = BigDecimal.valueOf(this.exp).add(BigDecimal.valueOf(addedExp)).doubleValue();
      if (this.exp >= Heros.MAX_EXP[this.level - 1]){
        this.levelUp();
      }
    }
  }

  public int getId(){
    return this.id;
  }

  // get the level of this hero
  public int getLevel(){
    return this.level;
  }

  public double getExp(){
    return this.exp;
  }

  // get the 
  public int getPa(){
    return Heros.PHY_ATTACK[this.level - 1];
  }

  // get the HP of this hero
  public int getHp(){
    return this.hp;
  }

  public int getPd(){
    return Heros.PHY_DEFENSE[this.level - 1];
  }

  public int getMp(){
    return this.mp;
  }

  // Method: check if alive
  public boolean isAlive() {
      return this.hp > 0;
    }

  public int getMaxHp(){
    return Heros.getMaxHP(this.level);
  }

  // 
  public boolean equals(Hero hero){
    return this.id == hero.getId();
  }

  public static void main(String[] args) {
    Hero hero1 = new Archer();
    System.out.println("Hero Level: " + hero1.getLevel());
    System.out.println("Hero Max HP: " + hero1.getMaxHp());
    System.out.println("Hero Current HP: " + hero1.getHp());
    System.out.println("Hero Physical Attack: " + hero1.getPa());
    System.out.println("Hero Magic Points: " + hero1.getMp());
    System.out.println("Is Hero Alive? " + hero1.isAlive());
    System.out.println("Max HP at Level 5: " + Heros.getMaxHP(5));

    Hero hero2 = new Mage();
    hero1.attack(hero2);
    System.out.println(hero1.getHp());
    System.out.println(hero2.getHp());
    System.out.println(hero2.isAlive());

    hero1.attack(hero2);
    System.out.println(hero1.getHp());
    System.out.println(hero2.getHp());
    System.out.println(hero2.isAlive());

    Mage A3 = new Mage();
      

  }
}

