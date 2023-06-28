class Student4{
    String stdName;
    int stdAge;
     public void printStudentInfo(){
        System.out.println(this.stdName);
        System.out.println(this.stdAge);
     }
     Student4(Student4 std6){
        this.stdName=std6.stdName;
        this.stdAge=std6.stdAge;

     }
     Student4(){

     }
}
public class copyConstructor {
    public static void main(String args[]){
        Student4 std5=new Student4();
        std5.stdName="Aditya";
        std5.stdAge=25;
        Student4 std6=new Student4(std5);
        std6.printStudentInfo();
    }
}
