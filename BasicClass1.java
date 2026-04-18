class Student{
    String name;
    String phone;
    int rollNo;

    Student(String name,String phone, int rollNo)
    {
        System.out.println("Line no 8");
        this.name=name;
        this.phone=phone;
        this.rollNo=rollNo;
        System.out.println("Line nno 10");
    }
    Student(){

    }
    Student(int a)
    {
        rollNo=a;
    }
    Student(Student s)
    {
        this.name=s.name;
        this.rollNo=s.rollNo;
        this.phone=s.phone;
    }
}
public class BasicClass1 {
    
    public static void main(String[] args) {
        // System.out.println("HELLO");
        Student s1=new Student("Aryan","1000",1);
        Student s2=new Student(s1);
        Student s3=s1;
        System.out.println(s1.name);
        System.out.println(s2.name);

        s1.name="Rohan";
        System.out.println(s1.name);
        System.out.println(s2.name);

    }
}
