class BankAccount
{
    private int balance;
    int id;
    String name;

    void depoist(int amt)
    {
        balance= balance+amt;
    }
    void withdraw(int amt)
    {
        if(amt>balance)
        {
            System.out.println("Insufficient balance");
            return;
        }
        balance= balance-amt;
    }
    
}
public class Banking {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.depoist(500);
        ba1.withdraw(5000);
        
    }
}
