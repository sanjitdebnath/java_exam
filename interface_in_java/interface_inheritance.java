// package interface_in_java;


interface animal{
    void sound();
}
interface dog extends animal{
    void dog_sound();
}
public class interface_inheritance implements dog {
    public void sound()
    {
        System.out.println("this is a animal sound");
    }
    public void dog_sound()
    {
        System.out.println("this is a dog sound");
    }
    public static void main(String[] args) {
        interface_inheritance obj = new interface_inheritance();
        obj.sound();  obj.dog_sound();
    }
    
}
