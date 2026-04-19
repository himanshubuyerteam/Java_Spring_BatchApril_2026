package Class2;
class Person
{
    String name;
    int id;
    String emailId;
    int m1;
    int m2;
    int m3;
    String address;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public int getM1() {
        return m1;
    }
    public void setM1(int m1) {
        this.m1 = m1;
    }
    public int getM2() {
        return m2;
    }
    public void setM2(int m2) {
        this.m2 = m2;
    }
    public int getM3() {
        return m3;
    }
    public void setM3(int m3) {
        this.m3 = m3;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    

    
}
public class OOPs1 {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setM1Marks(10);
        System.out.println(p1.m1);
        p1.setId(100);
        System.out.println(p1.id);
       

    }
}
