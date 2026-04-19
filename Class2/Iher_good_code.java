package Class2;
class Employee
{
    void walk()
    {
        System.out.println("WALKING");
    }
    void eat()
    {
        System.out.println("EATING");
    }
}
class Developer extends Employee
{
    void work()
    {
        System.out.println("CODING");
    }
}

class HR extends Employee
{
    void eat()
    {
        System.out.println("Longest Lunch Time");
    }
    void work()
    {
        System.out.println("I WILL HIRE");
    }
}

class Marketing extends Employee
{
    void work()
    {
        System.out.println("I will promote");
    }
}

public class Iher_good_code {
    public static void main(String[] args) {
        HR h1=new HR();
        h1.eat();
        h1.work();
    }
}

