package TH5_AccessModifier_XayDungLopChiGhi;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student (){

    }

    public String getName() {
        return name;
    }

    protected void setName() {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    protected void setClasses() {
        this.classes = classes;
    }
}
