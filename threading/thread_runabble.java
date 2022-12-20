// package threading;


class mythrunnable1 implements Runnable{
    public void run()
    {
        int i=0;
        while (i<10) {
            System.out.println("this is runnable 1");
            i++;
        }
    }
}
class mythrunnable2 implements Runnable{
    public void run()
    {
        try {
            
            int i=0;
            while (i<10) {
                System.out.println("this is runnable 2");
                // Thread.sleep(1000);
                i++;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

public class thread_runabble {
    public static void main(String[] args) {
        mythrunnable1 bul1 = new mythrunnable1();
        mythrunnable2 bul2 = new mythrunnable2();
        Thread gun1 = new Thread(bul1);
        Thread gun2 = new Thread(bul2);
        gun1.setPriority(2);
        gun1.start();
        // try {
        //     gun1.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
        gun2.start();
    }
}
