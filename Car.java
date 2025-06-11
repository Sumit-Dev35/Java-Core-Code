public class Car {
  int noOfWheels;
  int noOfDoors;
  int maxSpeed;
  String name;
  String modelNumner;
  String company;
  Car(int noOfWheels,int noOfDoors,int maxSpeed,String name,String modelNumber,String company){
    this.noOfWheels=noOfWheels;
    this.noOfDoors=noOfDoors;
    this.maxSpeed=maxSpeed;
    this.name=name;
    this.modelNumner=modelNumber;
    this.company=company;
  }
  public static void main(String[] args) {
      Car swift=new Car(4,4,120,"Swift","SWFT","Maruti");
      System.out.println(swift.toString());
  }
}
