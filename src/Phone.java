//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Phone {

    String name;
    int price;

    public void call(){
        System.out.println("Phone " + name);
    }
    public void call1(){
        System.out.println("Phone " + price + " is calling");
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.name = "iPhone X";
        phone.price = 10000;
        phone.call();
        phone.call1();
    }

}