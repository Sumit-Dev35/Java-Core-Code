class Animal {  
    private String name;  

    public Animal(String name) {  
        System.out.println("Animal Constructor");
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    }  

    public void makeSound() {  
        System.out.println("Some sound");  
    }  
}  
  
class Dog extends Animal {  

    public Dog(String name) { 
        super(name) ;
        System.out.println("Dog Cunstructor"); 
    }  
  
    @Override  
    public void makeSound() {  
        System.out.println("Woof");  
    }  
}  
  
class Cat extends Animal {  

    public Cat(String name) { 
        super(name);
        System.out.println("Cat Cunstructor"); 
    }  

    @Override  
    public void makeSound() {  
        System.out.println("Meow");  
    }  
}  
  
public class OOPs {  
    public static void main(String[] args) {  

        Dog dog = new Dog("Buddy");  
        Cat cat = new Cat("Whiskers");  

        System.out.println("Dog name: " + dog.getName());  
        dog.makeSound();  
  
        System.out.println("Cat name: " + cat.getName());  
        cat.makeSound();  
    }  
}  