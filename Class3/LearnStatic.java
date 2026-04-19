package Class3;
//Static Methods
//Static Data Members;
class abc
{
    int id;
    static int count;
    void fun()
    {
        System.out.println("Hello Guys!!");
    }
    static void fun1()
    {
        System.out.println("Hi Folks!!");
    }
}
public class LearnStatic {
    public static void main(String[] args) {
        abc obj1 = new abc();
        abc obj2 = new abc();
        abc obj3 = new abc();

        obj1.id=1;
        obj2.id=2;
        obj3.id=3;
        obj3.count++;
        obj2.count++;
        System.out.println(obj1.id);
        System.out.println(obj2.id);
        System.out.println(obj3.id);
        System.out.println("-----------");
        

        obj2.id=7;

        System.out.println(obj1.id);
        System.out.println(obj2.id);
        System.out.println(obj3.id);
        System.out.println("-----------");
        System.out.println(obj1.count);
        System.out.println(obj3.count);
        System.out.println(obj2.count);


    }
}
