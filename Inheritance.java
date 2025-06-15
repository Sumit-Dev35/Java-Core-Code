public class Inheritance {
  public int numberOfTires;
  public void commute(){
    System.out.printf("I am going from place a to place b by using %d tiers \n",numberOfTires);
  }
  public static void main(String[] args) {
    Inheritance obj1=new Inheritance();
    TwoWheeler obj2 =new TwoWheeler(); 
    obj2.commute(); 
    obj1.commute();
  }
}

class TwoWheeler extends Inheritance{

    public TwoWheeler() {
      numberOfTires=2;
    }
    
}