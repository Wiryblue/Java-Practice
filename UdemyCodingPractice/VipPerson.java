public class VipPerson {
    private int CreditLimit;
    private String Email;
    private String name;


    public VipPerson () {
        this(5000,"Duckhead@69","Defult");

    }

    public VipPerson(int creditLimit, String email, String name) {
        this.CreditLimit = creditLimit;
        this.Email = email;
        this.name = name;
    }

    public VipPerson(int creditLimit, String name) {
        this(creditLimit,"Duckhead@gmail.com",name);
        this.CreditLimit = creditLimit;
        this.name = name;
    }


    public int getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return Email;
    }

    public String getName() {
        return name;
    }
}
