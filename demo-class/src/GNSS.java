public class GNSS {
  private String name;
  private int numbofsatellite;
  private int numofuser;
  private int numofstation;
  private String owner;
  private boolean worldwidecoverage;
  private String yearofdeploy;
  private double accuracy;

  public void setName(String name){
    this.name = name;
  }
  
  public void setWorldwidecoverage(boolean worldwidecoverage){
    this.worldwidecoverage = worldwidecoverage;
  }

  public String getName(){
    return this.name;
  }

  public boolean getWorldwidecoverage(){
    return this.worldwidecoverage;
  }

  public static void main(String[] args) {
    GNSS gnss1 = new GNSS();
    gnss1.setName("GPS");
    System.out.println(gnss1.getName());

    gnss1.setWorldwidecoverage(true);
    System.out.println(gnss1.getWorldwidecoverage());
  }
}
