public class Name  extends Thread{
    
    // Name(String str)
    // {
    //     super(str);
    // }
    @Override
    public void run()
    {
        System.out.println("Name Thread is Running "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Name t1 = new Name("My Customized Name");
        Name t1=new Name();
        t1.setName("My Customized Name");
        t1.start();
    }
}
