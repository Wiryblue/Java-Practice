public class Dog extends Animal {
    private int eyes;
    private int leg;
    private int tail;
    private int teeth;
    private String fur;
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);

    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("sike overide");
    }
}
