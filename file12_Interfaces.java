interface Animal {
  public   void walk();// this is called abstract function
    // Animal(){
    // we dont have constructors in the interfaces
    // }
    // void eat(){
    // we cannot have not abstract function in the interface
    // neither the implementation of the function
    // }

}
interface Herbivore{

}
class Horse implements Animal, Herbivore{
    public void walk(){
System.out.println("Walks on 4 legs");
    }
     
}

public class Interfaces {
    public static void main(String args[]){
        Horse horse=new Horse();
        horse.walk();
    }

}

//points to remember 
//1. all the fields in the interfaces are public ,static and final by default.
//2. all the methods are public and abstract by default
//3. a class that implements an interface must implemen all the method declared in the interface
// 4. interfaces support the functionality of multiple inheritance


