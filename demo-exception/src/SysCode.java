public enum SysCode {
  LOGIN_FAIL(1, "Login Fail"),;

  private int code;
  private String description;

  private SysCode(int code, String description){
    this.code = code;
    this.description = description;
  }

  public int getCode(){
    return this.code;
  }

  public String getDescription(){
    return this.description;
  }
}
