package TH5_AccessModifier_StaticMethod;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDITT";

    Student (int r, String n) {
        rollno  = r;
        name = n;

    }
    static void change ()  {
        college = "CODEGYM";
    }
    void display () {
        System.out.println(rollno + " " + name + " " + college);
    }
}
