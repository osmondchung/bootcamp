import java.math.BigDecimal;

public class Hero {
  /*private static final int[] MAX_HP = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  private static final int[] PHY_ATTACK = new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};
  private static final int[] MAX_MP = new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
  private static final int[] PHY_DEFENSE = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
  private static final double[] MAX_EXP = new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};
  private static final double[] EXP_GAINED = new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};*/
  private static int idCounter = 0;

  private int id;         // Hero's ID
  private int level;     // Hero's level
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
    Hero hero1 = new Hero();
    System.out.println("Hero Level: " + hero1.getLevel());
    System.out.println("Hero Max HP: " + hero1.getMaxHp());
    System.out.println("Hero Current HP: " + hero1.getHp());
    System.out.println("Hero Physical Attack: " + hero1.getPa());
    System.out.println("Hero Magic Points: " + hero1.getMp());
    System.out.println("Is Hero Alive? " + hero1.isAlive());
    System.out.println("Max HP at Level 5: " + Heros.getMaxHP(5));

    Hero hero2 = new Hero();
    hero1.attack(hero2);
    System.out.println(hero1.getHp());
    System.out.println(hero2.getHp());
    System.out.println(hero2.isAlive());

    hero1.attack(hero2);
    System.out.println(hero1.getHp());
    System.out.println(hero2.getHp());
    System.out.println(hero2.isAlive());
      

  }
}

