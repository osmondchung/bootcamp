package enum1;

public enum Direction {
  // 4 Directions
  NORTH(1), 
  EAST(2), 
  SOUTH(-1),
  WEST(-2),
  ;

  private int value;

  private Direction(int value){
    this.value = value;
  }

  public int getValue(){
    return this.value;
  }

  // opposite

  public Direction opposite(){
    for (Direction d : Direction.values()){
      if (isOpposite(d, this))
        return d;
    }
    return null;
  }

  // static isOpposite()
  // public static
  public static boolean isOpposite(Direction d1, Direction d2){
    return d1.getValue() * -1 == d2.getValue();
  }
  
  public static Direction valueOf(int value){
    for (Direction d : Direction.values()){
      if (d.getValue() == value)
        return d;
    }
    return null;
  }

  public static void main(String[] args) {
    Direction d1 = Direction.WEST;
    Direction d2 = Direction.NORTH;
    System.out.println(d1.opposite());
    System.out.println(isOpposite(d1, d2));
  }

}