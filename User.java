class UserPerson{
    void display()
    {
        System.out.println("User Display");
    }
}
class Admin extends UserPerson{
    void display()
    {
        System.out.println("Admin Display");
    }
}
public class User {
    public static void main(String[] args) {
        Admin a1 = new Admin();
        a1.display();

        UserPerson u1 = new UserPerson();
        u1.display();


        UserPerson u2 = new Admin();
        u2.display(); 
    }
}
