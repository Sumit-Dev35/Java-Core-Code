class circle{
   public double radius;
   
   public double area(){
    return Math.PI*radius*radius;
   }

   public double perimeter(){
    return Math.PI*2*radius;
   }
}

class myCircle{
  public static void main(String[] args) {
      circle firstCircle=new circle();
      firstCircle.radius=10;
      System.err.println(firstCircle.radius);
      System.out.println(firstCircle.area());
      System.out.println(firstCircle.perimeter());
  }
}