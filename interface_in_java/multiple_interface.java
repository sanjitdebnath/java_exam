// package interface_in_java;

interface employee{
    void empInfo();
}
interface person{
    void psInfo();
}
public class multiple_interface implements employee,person {
    String name = "sanjit";
    double salary = 29000;
    String profession = "web developer";
    public void empInfo() {
        System.out.println("your name is "+name+" and your salary is "+salary);
    }
    public void psInfo() {
        System.out.println("your name is "+name);
    }
    public static void main(String[] args) {
        multiple_interface obj = new multiple_interface();
        obj.empInfo();
        obj.psInfo();
    }

}
