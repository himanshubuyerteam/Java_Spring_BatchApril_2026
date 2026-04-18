class vehicle
{
    void run()
    {
        System.out.println("RUNNING");
    }
}
class FastMovingVehicle extends vehicle
{
    void fastRun()
    {
        System.out.println("RUNNING FAST");
    }
}
class LuxuryCar extends FastMovingVehicle
{
    void luxury()
    {
        System.out.println("LUXURY");
    }
}
public class Car {
    public static void main(String[] args) {
        LuxuryCar lc1 = new LuxuryCar();
        lc1.run(); 
        lc1.fastRun();
    }
}


