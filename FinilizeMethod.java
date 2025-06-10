public class FinilizeMethod{
  @Override
  protected void finalize() throws Throwable {
    System.out.println("I am in Finilize");
  }
  public static void main(String[] args) {
    FinilizeMethod obj=new FinilizeMethod();
    System.out.println("I am in main");
  }
}