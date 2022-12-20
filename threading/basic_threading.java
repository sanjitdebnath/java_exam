
class myThread extends Thread
{
        int i=0;
        // @Override
        public void run()
        {
        while (i<10) 
            {
                System.out.println("hello");
                System.out.println("I am sanjit");
                i++;
            }
        }
}
class myThread2 extends Thread
{
    int i=0;
    public void run()
    {
    while (i<10) 
        {
            System.out.println("hello2");
            System.out.println("I am sanjit2");
            i++;
        }
    }
}

public class basic_threading{
    public static void main(String[] args) {
        myThread thread1 = new myThread();
        myThread2 thread2 = new myThread2();
        thread1.start();
        thread2.start();
    }
}
