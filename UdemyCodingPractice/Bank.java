public class Bank {

    int account_number;
    double current_balance;
    String customer_name;
    String Customer_Email;
    String CustomerPhoneNumber;

    public Bank (int account_number,double current_balance, String customer_name,String Customer_Email, String CustomerPhoneNumber ) {

        this.account_number = account_number;
        this.current_balance = current_balance;
        this.customer_name = customer_name;
        this.Customer_Email = Customer_Email;
        this.CustomerPhoneNumber = CustomerPhoneNumber;
    }



    public void Withdraw(int RequestedMoney ){
        if(RequestedMoney <= current_balance) {
            current_balance = current_balance - RequestedMoney;
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public double getCurrent_balance() {
        return current_balance;
    }

    public void setCurrent_balance(double current_balance) {
        this.current_balance = current_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_Email() {
        return Customer_Email;
    }

    public void setCustomer_Email(String customer_Email) {
        Customer_Email = customer_Email;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        CustomerPhoneNumber = customerPhoneNumber;
    }

    public void Deposit (int DepositMoney){
        current_balance = DepositMoney + current_balance;

    }


}
