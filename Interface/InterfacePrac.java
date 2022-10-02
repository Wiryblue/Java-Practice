package Section9.Interface;

public class InterfacePrac {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(5555345);
        timsPhone.powerOn();
        timsPhone.callPhone(5555345);
        timsPhone.answer();

        timsPhone = new MobilePhone(245653);
        timsPhone.powerOn();
        timsPhone.callPhone(245653);
        timsPhone.answer();

    }
}
