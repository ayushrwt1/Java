class MyRunnable implements Runnable{

    // run method is the entry point for the thread when it is started
    // it contain the code that will be executed in the new thread
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread()+ " , "+i);
        }
    }
}

