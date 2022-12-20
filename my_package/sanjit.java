package my_package;

public class sanjit{
    protected void nameDisplay()
    {
        System.out.println("my name is sanjit");
    }
    public static void main(String[] args) {
        sanjit s = new sanjit();
        s.nameDisplay();
    }
}
class anjali extends sanjit{
    public static void main(String[] args) {
        anjali a = new anjali();
        a.nameDisplay();
    }
}