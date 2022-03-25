package TH5_AccessModifier_XayDungLopChiGhi;

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName();
        std1.setClasses();
        System.out.println("In ra "+ std1.getName()+"\t"+ std1.getClasses() );
    }
}
