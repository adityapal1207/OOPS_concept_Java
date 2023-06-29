import java.util.*;
class Student{
    String stdName;
    int stdAge;
    public void printStudentInfo(){
        System.out.println(this.stdName);
        System.out.println(this.stdAge);
    }
    Student(){
        System.out.println("This is non-parameterized constructor lko");
    }
}
public class constructor {
    public static void main(String args[]){
        Student std1=new Student();
        std1.stdName="Aditya";
        std1.stdAge=22;
         std1.printStudentInfo();

    }
}
