//program for thread example by implementing runnable interface
class threadwithrunnable implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String args[])
    {
        threadwithrunnable t1=new threadwithrunnable();
        threadwithrunnable t2=new threadwithrunnable();
        Thread obj1=new Thread(t1);
        Thread obj2=new Thread(t2);
        obj1.start();
        obj2.start();
    }
}