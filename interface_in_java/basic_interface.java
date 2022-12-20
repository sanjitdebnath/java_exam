// package interface_in_java;

interface A{
    void funk();
}

public class basic_interface implements A {
    public void funk()
    {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        basic_interface obj = new basic_interface();
        obj.funk();
    }
}
