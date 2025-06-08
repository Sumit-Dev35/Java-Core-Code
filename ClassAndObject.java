public class ClassAndObject {
  int noOfWheels;
  String color;
  float maxSpeed;
  float currentFuelInLiters;
  int noOfseats;
  ClassAndObject(){
    this.noOfseats=0;
    this.maxSpeed=0;
    this.noOfWheels=0;
  }
  public void drive(){
    System.out.println("Car is driving");
    

  }
  public void addFuel(float fuel){
    this.currentFuelInLiters+=fuel;
  }

  public double getFuel(){
    return this.currentFuelInLiters;
  }
}

