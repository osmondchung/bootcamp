import hero.Hero;
import hero.Weapon;

public class Role extends Hero{
  private String roleType;
  private Weapon[] weapons;

  public Role(String roleType){
    this.roleType = roleType;
    this.weapons = weapons;
  }

  private String getRole(){
    return this.roleType = roleType;
  }

  //what weapon can this role equip?



  private double CC(String roleType, int level){
    
  }

  private int CD(String roleType, int level){
    int criticalDamage = 0;
    for (int i = 0; i < thisrolesCDarray[i]; i++){
      criticalDamage += thisrolesCDarray[i];
    }
    return criticalDamage;
  }

}
