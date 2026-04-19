package Class3;

abstract class FourWheeler{
    abstract void run();
    abstract void stop();
    void changeGear()
    {
        System.out.println("Change The Gear");
    }
}
abstract class TwoWheeler{
    abstract void run();
    abstract void stop();
    void changeGear()
    {
        System.out.println("Change The Gear");
    }
}
// class ConverterCar extends FourWheeler,TwoWheeler{
    
// }
class Active extends TwoWheeler{
    void run()
    {
        System.out.println("Activa Running");
    }
    void stop()
    {
        System.out.println("Activa Stopping");
    }
}
public class LearnAbsClass {
    
}
