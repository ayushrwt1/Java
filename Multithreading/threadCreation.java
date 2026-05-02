
public class threadCreation{
    public static void main(String[] args){
        System.out.println("Main thread started");

        Thread1 t1 = new Thread1();

        // start method is called to begin the execution of the thread
        // it invokes the run method in a new thread of execution
        // it tell JVM to schedule the thread for execution and allows it to run concurrently with the main thread
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();

        System.out.println("Main thread ended");
    
    }
}


