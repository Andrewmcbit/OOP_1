import java.util.List;

public interface VendingMachine {
    public void addHotDrinks(List<HotDrinks> list);
    public HotDrinks getProduct(String name);
    public List<HotDrinks> getList();
    public HotDrinks getProduct(String name, double volume, double temperature);
}
