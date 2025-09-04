public class BusinessException extends RuntimeException{
  private int code;

  public static BusinessException of(SysCode sysCode){
    return new BusinessException(sysCode);
  }

  private BusinessException(SysCode sysCode){
    super(sysCode.getDescription());
    this.code = sysCode.getCode();
  }

  private BusinessException(int code, String message){
    super(message);
    this.code = code;
  }

  private BusinessException(String message){
    super(message);
  }

  public int getCode(){
    return this.code;
  }

  public static void main(String[] args) {
    new BusinessException(SysCode.LOGIN_FAIL);
    BusinessException.of(SysCode.LOGIN_FAIL);
  }
}
