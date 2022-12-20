// package abstract;

abstract class animal{
    abstract void sound();
}

class lion extends animal{
    void sound() {
       System.out.println("roar"); 
    }
}
class elephent extends animal{
    void sound() {
       System.out.println("humpping"); 
    }
}


public class abstarct_class {
    public static void main(String[] args) {
        
        lion l = new lion();
        elephent e = new elephent();
    
        l.sound();      e.sound();
    }

}
