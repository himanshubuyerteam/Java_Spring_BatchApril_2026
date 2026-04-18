class Person
{
    String name;
    int id;
    String emailId;
    int m1;
    int m2;
    int m3;
    String address;

    Person(Person p)
    {
        this.id=p.id;
        this.name=p.name;
        this.emailId=p.emailId;
        this.address=p.address;
    }
    Person(String name,int id,String emailId,String address){
        this.id=id;
        this.name=name;
        this.emailId=emailId;
        this.address=address;
    }
    void setMarksM1(int m1)
    {
        this.m1=m1;
    }
    void setMarksM2(int m2)
    {
        this.m2=m2;
    }
    void setMarksM3(int m3)
    {
        this.m3=m3;
    }
    String getEmail()
    {
        return emailId;
    }
    int getM1Marks()
    {
        return m1;
    }
    void print()
    {
        System.out.println("Thanks for Calling Print Function");
        System.out.println("Id of the person is "+id);
        System.out.println("Name of the person is "+name);
        System.out.println("EmailId of the person is "+emailId);
        System.out.println("Address of the person is "+address);
    }
    int totalMarks()
    {
        return m1+m2+m3;
    }
}
public class OOPs1 {
    public static void main(String[] args) {
        Person p1 = new Person("Aryan",1,"Aryan@123","Delhi");
        p1.print();
        p1.setMarksM1(10);
        p1.setMarksM2(20);
        p1.setMarksM3(30);
        p1.m1=20;
        System.out.println(p1.totalMarks());
       

    }
}
