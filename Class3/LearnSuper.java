package Class3;

//Used to Call Parent Constructor
class lion
{
    int id;
    int age;
    lion(int id,int age)
    {
        this.id=id;
        this.age=age;
    }
}
class lionChild extends lion{
    int weight;
    lionChild(int id,int age,int weight)
    {
        super(id,age);
        this.weight=weight;
    }
}
public class LearnSuper {
    public static void main(String[] args) {
        lionChild lc=new lionChild(1, 10, 100);
        
    }
}
