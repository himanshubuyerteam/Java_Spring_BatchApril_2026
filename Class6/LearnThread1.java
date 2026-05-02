class LearnThread1
{
    public static void main(String[] args) {
        // System.out.println("Hello");
        // System.out.println(Thread.currentThread().getName());
        MyOwnThread obj = new MyOwnThread();
        obj.start();

        MyOwnThreadByRunnable obj1 = new MyOwnThreadByRunnable();
        Thread t1 = new Thread(obj1);
        t1.start();
    }
}