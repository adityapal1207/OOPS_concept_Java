class Student_Polymorphism{
    String stdName;
    int stdAge ;
     public void printStudentInfo(String stdName){
        System.out.println("The name of the student is "+ stdName);
     }
     public void printStudentInfo(int stdAge){
        System.out.println("The age of the student is "+ stdAge);
     }
    public void printStudentInfo(String stdName ,int stdAge){
        System.out.println("The name of the student is "+ stdName + " and age is :"+ stdAge);
     }

}
public class polymorphism {
    public static void main(String args[]){
        Student_Polymorphism std10= new Student_Polymorphism();
        std10.stdName="Aditya";
        std10.stdAge=23;
        std10.printStudentInfo(std10.stdName, std10.stdAge );// if you want Name and age 
        //then just pass both the parameters
        std10.printStudentInfo(std10.stdAge);// only to print age
        std10.printStudentInfo(std10.stdName);

    }

}
