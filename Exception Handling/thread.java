//program to use thread class and  use of run start and active count
class thread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
    //active count and get name
    public static void main(String args[])
    {
        thread t1=new thread();
        thread t2=new thread();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());
        t1.start();
        t2.start();
        System.out.println("Thread t1 is alive:"+t1.isAlive());
        System.out.println("Thread t2 is alive:"+t2.isAlive());
        System.out.println("Active thread count:"+Thread.activeCount());
    }
    
   

}
