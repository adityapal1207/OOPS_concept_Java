import java.util.*;
class Pen {
    String color;
    String type;
    String brand;

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }

    public void printBrand() {
        System.out.println(this.brand);
    }
}

class Student{
     String stdName; //Student name
     int stdAge; // student age 
     public void printStudentInfo(){
        System.out.println(this.stdName);
        System.out.println(this.stdAge);
    }
    
}


public class file1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Hey this output is from main !");
        Pen Pen1 = new Pen();
        
        Pen1.color = "Blue";
        Pen1.type = "Gel";
        Pen1.brand = "Elkos";
        
        Pen1.printType();
        Pen1.printColor();
        Pen1.printBrand();

        Pen Pen2 = new Pen();

        Pen2.color = "Black";
        Pen2.type = "Ball Point Pen";
        Pen2.brand = "Pentonic";
        
        Pen2.printType();
        Pen2.printColor();
        Pen2.printBrand();
        
        Student std1=new Student();
        std1.stdName="Aditya Kumar Pal";
        std1.stdAge=21;
        std1.printStudentInfo();


    }
}