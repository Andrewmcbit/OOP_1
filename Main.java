import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinks hd1 = new Tea("BlackTea", 0.2, 80);
        //HotDrinks hd2 = new HotDrinks("Coffee", 0.3);
        HotDrinks hd3 = new Tea("GreenTea", 0.4, 70);
        //HotDrinks hd4 = new HotDrinks("Latte", 0.3);

        VendingMachine hotDrinksMachine = new HotDrinksMachine();
        //hotDrinksMachine.addHotDrinks(List.of(hd1,hd2,hd3,hd4));
        hotDrinksMachine.addHotDrinks(List.of(hd1,hd3));


        System.out.println(hotDrinksMachine.getList());
        //System.out.println(hotDrinksMachine.getProduct("Coffee"));
        //System.out.println(hotDrinksMachine.getProduct("BlackTea"));
        System.out.println(hotDrinksMachine.getProduct("GreenTea"));
        System.out.println(hotDrinksMachine.getProduct("GreenTea",0.4,70));
    }
}
