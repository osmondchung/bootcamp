package hero;
public abstract class Weapon {
  abstract double getPA();

  abstract double getMA();

  abstract double getCC();

  public static void main(String[] args) {
    int[][] heroPaMap = new int[3][10];
    int[][] heroMaMap = new int[3][10];
    int[][] heroCcMap = new int[3][10];
    // Warrior
    heroPaMap[0] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    // Archer
    heroPaMap[1] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    // Mage
    heroPaMap[2] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};



  }
  
}
