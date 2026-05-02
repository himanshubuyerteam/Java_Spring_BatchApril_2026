public class LifeCycle extends Thread {
    @Override
    public void run()
    {
        try{
            Thread.sleep(10000);
        } catch(Exception e){
            
        }
        System.out.println("Thread LifeCycle is Running");
    }
    public static void main(String[] args) throws InterruptedException {
        LifeCycle t1 = new LifeCycle();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        t1.join();
        System.out.println(t1.getState());

    }
}
