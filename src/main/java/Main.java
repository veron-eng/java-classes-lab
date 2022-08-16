public class Main {

    public static void main(String[] args) {


        Account account1 = new Account("90","Veron", 100);

        String account1info =account1.toString();

        System.out.println(account1info);

        int myBalance = account1.getBalance();

        System.out.println(myBalance);

        Circle Circle1 = new Circle(4);

        double myCircumference = Circle1.getCircumference();

        System.out.println(myCircumference);

        //myCircumference.setRadius(2);

        Rectangle rectangle1 = new Rectangle(3.2, 3.2);


        Customer customer1 = new Customer(9,"Veron","Sundaram",200 );

        String customer1FullName = customer1.getFullName();
        System.out.println(customer1FullName);

    }
}
