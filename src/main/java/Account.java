public class Account {

    String id;
    String name;
    int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name=name;
        this.balance=balance;
    }


    @Override
    public String toString() {
        return "Account{" + "id='" + id + ", name='" + name + ", balance=" + balance + '}';
    }


    public String getId() {
        return this.id;
    }

    public String getName() {
        return  this.name;
    }

    public int getBalance() {
        return this.balance;
    }
}
