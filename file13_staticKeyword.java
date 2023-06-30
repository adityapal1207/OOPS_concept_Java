class Students {
    String name;
    static String school;
    public static void changeSchool(){
        school="LPU";
    }
}


public class StaticKeyword {
    public static void main(String args[]) {
        Students.school = "JDC_LUCKNOW"; // Here we are able o use school without making object
        // because we have decalred it as static
        // so , static methods and variables can be used with the name of the class
        // without the object.

        Students stdd1 = new Students();
        Students.changeSchool();
        stdd1.name = "Aditya Kumar Pal";
        System.out.println(stdd1.school);
    }
}
