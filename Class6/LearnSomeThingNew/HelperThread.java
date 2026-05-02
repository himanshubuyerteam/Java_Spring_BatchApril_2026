package LearnSomeThingNew;

public class HelperThread extends Thread {
    
    counter c ;
    HelperThread(counter c)
    {
        this.c=c;
    }
    @Override 
    public void run()
    {
        for(int i=0;i<1000;i++)
            c.increment();
    }
}
