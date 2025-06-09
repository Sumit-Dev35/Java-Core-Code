public class StaticKeyword {
  String name;
  String dateOfLicence;
  static int minAge=18;
  public static void main (String [] args){
   StaticKeyword myStaticKeyword=new StaticKeyword();
   myStaticKeyword.name="HI";
   System.out.println(myStaticKeyword.name);
   System.out.println(StaticKeyword.minAge);
  }
}
