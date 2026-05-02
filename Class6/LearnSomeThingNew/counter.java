package LearnSomeThingNew;

public class counter {
    int c=0;

    synchronized void increment()
    {
        c++;
    }

    int getCount()
    {
        return c;
    }
}
