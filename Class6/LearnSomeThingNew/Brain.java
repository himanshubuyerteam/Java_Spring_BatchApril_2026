package LearnSomeThingNew;

public class Brain {
    public static void main(String[] args) throws InterruptedException {
        counter c =new counter();
        HelperThread t1=new HelperThread(c);
        HelperThread t2=new HelperThread(c);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count is "+c.getCount());
    }
}
