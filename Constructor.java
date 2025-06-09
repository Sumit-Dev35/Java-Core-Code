

public class  Constructor{
  String name;
  int age;

public Constructor(String name,int age) {
   this.name=name;
   this.age=age;
  }
  
  void show(){
    System.out.println(this.name +" "+this.age);
  }
  public static void main(String[] args) {
      Constructor obj1=new Constructor("sumit",18);
      obj1.show();
      Constructor obj2=new Constructor("Vinay",16);
      obj2.show();

  }
}
