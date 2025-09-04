package hero;

// final class -> cannot be extended
public final class Heros {
  public static final int[] MAX_HP = new int[] {20, 40, 60, 80, 100, 120, 140, 160, 180, 200};
  public static final int[] WARRIOR_MAX_HP = new int[]{};
  public static final int[] MAGE_MAX_HP = new int[]{};
  public static final int[] ARCHER_MAX_HP = new int[]{};

  public static final int[] WARRIOR_MAX_MP = new int[]{};
  public static final int[] MAGE_MAX_MP = new int[]{};
  public static final int[] ARCHER_MAX_MP = new int[]{};

  public static final int[] WARRIOR_MAX_AG = new int[]{};
  public static final int[] MAGE_MAX_AG = new int[]{};
  public static final int[] ARCHER_MAX_AG = new int[]{};

  public static final int[] WARRIOR_MAX_PA = new int[]{};
  public static final int[] MAGE_MAX_PA = new int[]{};
  public static final int[] ARCHER_MAX_PA = new int[]{};

  public static final int[] WARRIOR_MAX_PD = new int[]{};
  public static final int[] MAGE_MAX_PD = new int[]{};
  public static final int[] ARCHER_MAX_PD = new int[]{};

  public static final int[] WARRIOR_MAX_MA = new int[]{};
  public static final int[] MAGE_MAX_MA = new int[]{};
  public static final int[] ARCHER_MAX_MA = new int[]{};

  public static final int[] WARRIOR_MAX_MD = new int[]{};
  public static final int[] MAGE_MAX_MD = new int[]{};
  public static final int[] ARCHER_MAX_MD = new int[]{};

  public static final int[] WARRIOR_MAX_CC = new int[]{};
  public static final int[] MAGE_MAX_CC = new int[]{};
  public static final int[] ARCHER_MAX_CC = new int[]{};

  public static final int[] WARRIOR_MAX_CD = new int[]{};
  public static final int[] MAGE_MAX_CD = new int[]{};
  public static final int[] ARCHER_MAX_CD = new int[]{};


  public static final int[] PHY_ATTACK = new int[] {10, 15, 20, 25, 30, 35, 40, 45, 50, 55};

  public static final int[] MAX_MP = new int[] {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

  public static final int[] PHY_DEFENSE = new int[] {3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

  public static final double[] MAX_EXP = new double[] {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0};

  public static final double[] EXP_GAINED = new double[] {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};




   
  public static final String[] WARRIOR_WEAPON = new String[] {"Recurve", "Guinsoo"};
  public static final String[] MAGE_WEAPON = new String[] {"Doran", "Hexdrinker"};
  public static final String[] ARCHER_WEAPON = new String[] {"Archangel", "Liandry"};

  public static final int[] RECURVE_PA = new int[] {};
  public static final int[] RECURVE_MA = new int[] {};
  public static final int[] RECURVE_CC = new int[] {};

  public static final int[] GUINSOO_PA = new int[] {};
  public static final int[] GUINSOO_MA = new int[] {};
  public static final int[] GUINSOO_CC = new int[] {};

  public static final int[] DORAN_PA = new int[] {};
  public static final int[] DORAN_MA = new int[] {};
  public static final int[] DORAN_CC = new int[] {};

  public static final int[] HEXDRINKER_PA = new int[] {};
  public static final int[] HEXDRINKER_MA = new int[] {};
  public static final int[] HEXDRINKER_CC = new int[] {};

  public static final int[] ARCHANGEL_PA = new int[] {};
  public static final int[] ARCHANGEL_MA = new int[] {};
  public static final int[] ARCHANGEL_CC = new int[] {};

  public static final int[] LIANDRY_PA = new int[] {};
  public static final int[] LIANDRY_MA = new int[] {};
  public static final int[] LIANDRY_CC = new int[] {};


  public static int getMaxHP(int level){
    if (level < 1 || level > MAX_HP.length)
      return -1;
    return MAX_HP[level - 1];
  }

  public static double calcAddedExp(int killedHeroLevel){
    return EXP_GAINED[killedHeroLevel - 1];
}

  public static void main(String[] args) {
    
  }
}
