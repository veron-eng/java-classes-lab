public class Customer {

        int id;
        String firstName;
        String lastName;
        double heldMoney;

        public Customer(int id,String firstName, String lastName, double heldMoney){
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.heldMoney = heldMoney;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }

        public void subtractMoneyHeld() {
            this.heldMoney = heldMoney;
        }



}
